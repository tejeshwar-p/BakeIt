/**
 * This js file contains the common javascript functions for whole application
 */

$(document).ready(function(){
    
    $("#clickMe").click(function(){
      $.ajax({
      URL: "http://localhost:8085/BakeItStore/getAllCakes",
      dataType: "application/JSON",
      type: "GET",
      success: function(result, status, xhr){
        $("#tableDiv").html(result);
      }
      });
    });
    
});
