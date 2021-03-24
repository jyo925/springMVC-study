package hello.springmvc.basic;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
@RestController는
http body에 return 값 문자를 그대로 반환
* */
@Slf4j
//@Log4j2
//@Log
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {

        String name = "Spring";
        System.out.println("name = " + name);

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);
        //2021-03-23 16:40:37.956  INFO 23672 --- [io-8080-exec-10] hello.springmvc.basic.LogTestController  : info log = Spring
        //시간, info, 프로세스 id, 현재 실행한 스레드, 컨트롤러 네임, 메시지 등이 출력됨

        return "ok";
    }

}
