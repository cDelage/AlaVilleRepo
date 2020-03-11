function getCommande(){
	
	var mag = $("#magasin-select option:selected").attr("name");
	var prod = $("#produit-select option:selected").attr("name");
	var nomcli = $("#nomcli").val();
	var quant = $("#quantity").val();
	var price = $("#produit-select option:selected").attr("value");
	var urlCalled = "http://localhost:5555/api/ville/insert"
	console.log(mag);
	console.log(prod);
	console.log(nomcli);
	console.log(quant);
	console.log(price);
	
	$.ajax({
		url: urlCalled,
		type: 'get',
		data: {
			'magasin' : mag,
			'produit' : prod,
			'prix' : price,
			'quantite' : quant,
			'client' : nomcli
			},
		success : function(data){
			var msg = "Bonjour " + nomcli + ", vous avez acheté sur le magasin " + mag + ", le produit " + prod + " à " + price +" €";
			alert(msg);
			
		},
		error : function (req, err){
			console.log(req)
			console.log(err)
		}
	});
}