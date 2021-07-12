package villuv.springboot.querydsl.bug.app;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTheBean is a Querydsl query type for TheBean
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTheBean extends EntityPathBase<TheBean> {

    private static final long serialVersionUID = 948998486L;

    public static final QTheBean theBean = new QTheBean("theBean");

    public final StringPath value = createString("value");

    public QTheBean(String variable) {
        super(TheBean.class, forVariable(variable));
    }

    public QTheBean(Path<? extends TheBean> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTheBean(PathMetadata metadata) {
        super(TheBean.class, metadata);
    }

}

