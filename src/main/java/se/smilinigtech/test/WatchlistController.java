/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.smilinigtech.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author mahboob.butt
 */
@Controller
public class WatchlistController {
    
    @GetMapping("/watchlist")
    public ModelAndView getWatchlist(){
        String viewname = "watchlist";
        
        List<WatchlistItem> watchlistitems = new ArrayList<>();
        
        Map<String, Object> model = new HashMap<>();
        
        watchlistitems.clear();
        watchlistitems.add(new WatchlistItem("Incredibles", 8.0, "medium-high", "The underminer!!!"));
        watchlistitems.add(new WatchlistItem("Frozen", 7.0, "medium", "Let it go!"));
        watchlistitems.add(new WatchlistItem("Aladdin", 8.5, "high", "A whole new world!"));
        watchlistitems.add(new WatchlistItem("Bambi", 6.0, "medium-low", "Thumper"));
        
        model.put("watchlistitems", watchlistitems);
        model.put("numberOfMovies", watchlistitems.size());
        
        
        return new ModelAndView(viewname, model);
        
        
    }
    
    @GetMapping("/watchlistitem")
    public ModelAndView getWatchlistItem(){
        String viewname = "watchlistitem";
        
        Map<String, Object> model = new HashMap<>();
        
       // model.put(viewname, new WatchlistItem());
        
        return new ModelAndView(viewname, model);
    }
}
