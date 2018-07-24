package Server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping("/search")
    @ResponseBody
    public String getCoverUrl (
            @RequestParam(name="query", defaultValue = "") String query){
        String results ="";
        String src = WebScraper.getArtUrl(query);
        String body = "<html><img src='" + src + "'/></html>";
        return body;
    }


}
