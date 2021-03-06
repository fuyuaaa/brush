package top.fuyuaaa.brush.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import top.fuyuaaa.brush.dyopen.DyOpenConfig;

/**
 * @author : fuyuaaa
 * @date : 2020-12-03 19:51
 */
@EnableBrush(type = BrushEnum.BrushConstants.DY_OPEN_CODE)
@PropertySource("classpath:application.properties")
public class BrushConfigurationTest {

    @Bean
    public DyOpenConfig dyOpenConfig(){
        return new DyOpenConfig("","");
    }
}
