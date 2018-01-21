import com.epam.groovy.quoters.banpostprocessors.DeprecationHandlerBeanFactoryPostProcessor
import com.epam.groovy.quoters.banpostprocessors.InjectRandomIntAnnotationBeanPostProcessor
import com.epam.groovy.quoters.banpostprocessors.PostProxyInvokerContextListener
import com.epam.groovy.quoters.banpostprocessors.ProfilingHandlerBeanPostProcessor
import com.epam.groovy.quoters.model.TerminatorQuoter


xmlns([ctx:'http://www.springframework.org/schema/context'])
ctx.'component-scan'('base-package':"com.epam.groovy")
ctx.'annotation-config'()

beans {
    InjectRandomInt(InjectRandomIntAnnotationBeanPostProcessor)
    TerminatorQuoter(TerminatorQuoter){
        message="I'll be back"
    }
    DeprecationHandlerBeanFactoryPostProcessor(DeprecationHandlerBeanFactoryPostProcessor)
    PostProxyInvokerContextListener(PostProxyInvokerContextListener)
    ProfilingHandlerBeanPostProcessor(ProfilingHandlerBeanPostProcessor)
}