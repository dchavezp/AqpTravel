


function addAdmin(){	
	var url = "admin/saveAdmin";
	
	alert("hahahah!!"+$("#nombre").val());
	$.ajax({
        url: url,
        type: 'POST',
        data: $('#form_regUsuario').serialize(),      
        success: function(result){
        if(result){  
        	 
            alert('sucess add Admin!' + result);                        
        }
        else{
            alert('ocurrio algun ERROR, vuelva a intentarlo ');
        }   
               
        },
        error: function(){
        alert('Ocurrio un erro en el Proceso');
        }
    });
}


function deleteAdmin(){
	var url = 'removeAdmin';
	
	alert("Entramos!!"+$("#nombre").val());
	$.ajax({
        url: url,
        type: 'POST',
        data: $('#form_regUsuario').serialize(),      
        success: function(result){
        if(result){  
        	//$('#data_table_serv').load('../request/service/getAllService.php'); 
            alert('sucess add Provider!' + result); 
            //clearService();              
        }
        else{
            alert('ocurrio algun ERROR, vuelva a intentarlo ');
        }   
               
        },
        error: function(){
        alert('Ocurrio un erro en el Proceso');
        }
    });
	
}