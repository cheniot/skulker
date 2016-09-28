package PACKAGE4.PACKAGE3.PACKAGE2.PACKAGE1.PACKAGE0;

import MODEL_SUPPORT.ModelSupport;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author lpw
 */
@Component(MODULEModel.NAME + ".model")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Entity(name = MODULEModel.NAME)
@Table(name = "t_PACKAGE1_MODULE_")
public class MODULEModel extends ModelSupport {
    static final String NAME = "PACKAGE2.PACKAGE1.MODULE-";
}