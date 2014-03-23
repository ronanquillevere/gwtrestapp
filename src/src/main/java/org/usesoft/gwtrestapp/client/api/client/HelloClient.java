package org.usesoft.gwtrestapp.client.api.client;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;
import org.usesoft.gwtrestapp.shared.domain.Hello;

@Path("/api/hellos")
public interface HelloClient extends RestService {
	
	@GET
	public void getHellos( MethodCallback<List<Hello>> callback);
	
	@GET
	@Path("/{id}")
	public void getHellos(@PathParam("id") String id, MethodCallback<List<Hello>> callback);
}
