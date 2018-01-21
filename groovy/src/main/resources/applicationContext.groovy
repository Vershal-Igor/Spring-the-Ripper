
import com.epam.groovy.quoters.banpostprocessors.InjectRandomIntAnnotationBeanPostProcessor
import com.epam.groovy.quoters.model.TerminatorQuoter

beans {
    test3(InjectRandomIntAnnotationBeanPostProcessor)
    test4(TerminatorQuoter){bean->
        bean.scope = "singleton"
        message="I'll be back"
    }

    xmlns([ctx:'http://www.springframework.org/schema/context'])
    ctx.'component-scan'('base-package':"com.epam.groovy")
    ctx.'annotation-config'()
}