package vip.breakpoint.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import vip.breakpoint.XmlEnableLoggingConfiguration;

/**
 * @author :breakpoint/赵立刚
 */
public class LoggingBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    // 定义自己的组件
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
                                        BeanDefinitionRegistry registry) {
        registry.registerBeanDefinition(XmlEnableLoggingConfiguration.class.getName(),
                new RootBeanDefinition(XmlEnableLoggingConfiguration.class));

    }
}
