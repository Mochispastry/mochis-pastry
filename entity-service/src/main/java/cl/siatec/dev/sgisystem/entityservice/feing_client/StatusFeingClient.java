package cl.siatec.dev.sgisystem.entityservice.feing_client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "dmaster-basic-service-status", url = "http://localhost:")
public interface StatusFeingClient {
}
