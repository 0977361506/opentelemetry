package kanban.mb_tracing.configs;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.instrumentation.httpclient.JavaHttpClientTelemetry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.http.HttpClient;

@Configuration
public class HttpClientConfig {

    private final OpenTelemetry openTelemetry;

    // Inject OpenTelemetry instance
    public HttpClientConfig(OpenTelemetry openTelemetry) {
        this.openTelemetry = openTelemetry;
    }

    @Bean
    public HttpClient tracedHttpClient() {
        return JavaHttpClientTelemetry.builder(openTelemetry).build().newHttpClient(createHttpClient());
    }

    private HttpClient createHttpClient() {
        return HttpClient.newBuilder().build();
    }

}
