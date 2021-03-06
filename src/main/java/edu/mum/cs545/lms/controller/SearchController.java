package edu.mum.cs545.lms.controller;

import edu.mum.cs545.lms.domain.Book;
import edu.mum.cs545.lms.domain.BookCategory;
import edu.mum.cs545.lms.service.BookService;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value={"/","/search"})
public class SearchController {

    public SearchController() { 
        categories = new TreeMap<String, String>();        
        List<BookCategory> bookCategoryList = Arrays.asList(BookCategory.values());
        for(BookCategory cat : bookCategoryList){
            categories.put(cat.name(), String.format("images/%d.jpg", cat.ordinal()));
        }
    }   
    
    private Map<String, String> categories;
    
    @RequestMapping
    public String index(Model model) {
        model.addAttribute("categories", categories);
        return "search";
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public String post(String q, Model model) {  
        model.addAttribute("queryParam", q);
        return "listsearch";
    }

    @RequestMapping("/category/{category}")
    public String getCategory(@PathVariable String category, Model model) {
        model.addAttribute("categoryParam",category);
        return "listsearch";
    }
    
    
    @Autowired
   private BookService bookService;
    
    @RequestMapping(value="/rest/list",method=RequestMethod.GET )
    public @ResponseBody List<Book> getSearchList(HttpServletRequest request,@RequestParam String q,@RequestParam String c){
        if(!"".equals(q)){//key words
            return bookService.getBookByKeyword(q);
        }
        else if(!"".equals(c)){//category
            return bookService.getBookByCategory(Enum.valueOf(BookCategory.class, c));
        }
        
        return null;
    }
}
