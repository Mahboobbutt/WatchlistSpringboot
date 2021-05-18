/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.smilinigtech.test;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author mahboob.butt
 */
@Controller
public class WatchlistController {
    
    @GetMapping("/watchlist")
    public ModelAndView getWatchlist(){
        String viewname = "watchlist";
        
        Map<String, Object> model = new HashMap<>();
        
        model.put(viewname, "123");
        
        return new ModelAndView(viewname, model);
        
        
    }
}
