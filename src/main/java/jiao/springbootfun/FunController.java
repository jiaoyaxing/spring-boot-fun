package jiao.springbootfun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController("/")
public class FunController {

    Logger logger = LoggerFactory.getLogger(FunController.class);

    @GetMapping("/index")
    public Object index(){
        return "success";
    }

    @GetMapping("/test")
    public void test(HttpServletResponse response) throws IOException {
        response.sendRedirect("http://localhost/apple");
    }

    @GetMapping("/apple")
    public void apple(){
        logger.info("----->");
    }
}
