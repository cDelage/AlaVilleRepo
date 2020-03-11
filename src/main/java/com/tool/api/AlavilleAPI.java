package com.tool.api;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.tool.entity.Commande;
import com.tool.services.ICommandeService;

@Path("/ville")
public class AlavilleAPI {

	private ICommandeService commandeService;
	
	@GET
	@Path("/insert")
	@Produces(MediaType.APPLICATION_JSON)
	public Response insertCommande(@QueryParam("produit") String produit, @QueryParam("client") String client, @QueryParam("magasin") String magasin, @Context ServletContext servletContext,
			@QueryParam("quantite") String quantite,@QueryParam("prix") String prix,
	@Context HttpServletRequest request) {
		ApplicationContext appContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		this.commandeService = appContext.getBean(ICommandeService.class);
		
		Commande commande = new Commande();
		commande.setNomClient(client);
		commande.setNomMagasin(magasin);
		commande.setNomProduit(produit);
		commande.setPrice(prix);
		commande.setQuantity(quantite);
		
		return Response.ok(commandeService.insert(commande)).build();
	}
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCommande(@Context ServletContext servletContext, @Context HttpServletRequest request) {
		ApplicationContext appContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		this.commandeService = appContext.getBean(ICommandeService.class);
		return Response.ok(commandeService.findAll()).build();
	}
}
