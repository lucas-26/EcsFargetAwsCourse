package com.myorg;

import software.amazon.awscdk.core.Construct;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.core.StackProps;

public class CursoAwsCdkStack extends Stack {
    
    private final SnsTopic productEventsTopic;

    public CursoAwsCdkStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public CursoAwsCdkStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        productEventsTopic =  SnsTopic.Builder.create(Topic.Builder.create(this, "productEventsTopic"))
        .topicBuilder("product-events")
        .builder()
        .build();

        productEventsTopic.getTopic.addSubscription(EmailSubscription.Builder.create("luquinhas.araujo26@hotmail.com")
            .json(true)
            .build());
    }

    public SnsTopic getProductEventTopic(){
        return productEventsTopic;
    }
}
