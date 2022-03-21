package cn.lsuper.template;

import org.junit.jupiter.api.Test;

import java.security.Principal;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/3/21 13:20
 */
public class TemplatePatternTest {
    @Test
    public void test() {
        Game cricket = new Cricket("C：");
        cricket.initialize();
        cricket.play();
        cricket.endPlay();

        Game football = new Football("D:");
        football.initialize();
        football.play();
        football.endPlay();
    }
}
