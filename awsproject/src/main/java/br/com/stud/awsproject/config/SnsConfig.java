
@Configuration
public class SnsConfig {

    @Value("aws.region")
    private String awsRegion;
    @Value("aws.sns.topic.product.events.arn")
    private String productsEventsTopic;

    @Bean
    public AmazonSns snsClient() {
        return AmazonSnsClientBuilder.standard()
            .withRegion(awsRegion)
            .withCredentials(new DefaultCredentialsProviderChain())
            .build();
    }

    @Bean(name = "productEventsTopic")
    public Topic snsProductEventsTopic(){
        return new Topic().WithTopicArn(ProductEventsTopic); 
    }

}
