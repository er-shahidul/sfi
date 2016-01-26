jQuery(document).ready(function($)
{
	$('#settings, .validationMessages, .hasPopover').popover({html:true});
	
//	$('input').iCheck({
//		checkboxClass: 'icheckbox_square-green',
//		radioClass: 'iradio_square-green'
//	});
//
	$("[data-toggle=\"tooltip\"]").tooltip();
	
	$('.datetimepicker').datetimepicker({
		pickTime: false
	});
	
	$('body').on('click', function(e)
	{
		$('[data-toggle="popover"]').each(function ()
		{
			if (!$(this).is(e.target) && $(this).has(e.target).length === 0 && $('.popover').has(e.target).length === 0 && $('.popover').find(".btn-cancel").length == 0)
			{
				$(this).popover('hide');
			}
		});
	});
	
	$(document).on("click", ".popover .btn-cancel", function()
	{
		$('.popover').popover('hide');
	});
	
	$(document).on("click", ".popover .btn-success", function()
	{
		$('.popover').popover('hide');
	});
			
	$(document).on('click', ".changeParent", function(e)
	{
		$($(this).data("parent")).html($(this).val());
	});
	
	$(document).on('change', '.btn-file :file', function()
	{
		var input = $(this),
		numFiles = input.get(0).files ? input.get(0).files.length : 1,
		label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
		input.trigger('fileselect', [numFiles, label]);
		});
		
		$('.btn-file :file').on('fileselect', function (event, numFiles, label) {
		$("#valdfil").append('<a href="#" class="fileupload-exists" data-dismiss="fileupload">'+label+'</a>');
	});
	
	$(".activetePopupOnLess").on("change", function()
	{
		if (parseInt($(this).val()) < parseInt($(this).data("less")))
			$(this).popover("show");
		else
			$(this).popover("hide");
	});

	////add  by rubel
    //
	//$(".positiveNumber").on("keypress keyup blur",function (event) {
	//	alert(1);
	//	$(this).val($(this).val().replace(/[^\d].+/, ""));
	//	if ((event.which < 48 || event.which > 57)) {
	//		event.preventDefault();
	//	}
	//});


	$(".activetePopupOnData").on("change", function()
	{
		if ($(this).val().length > 0)
			$(this).popover("show");
		else
			$(this).popover("hide");
	});
	
	$(".activateThisPopover").click(function()
	{
		$(this).parent().find(".hasPopover").popover("show");
		return false;
	});
	
	$(".enableOnCheck").on('ifChanged', function(e)
	{
		if (!$(this).parent().hasClass('checked'))
		{
			if ($(this).hasClass("activatePopoverOnChecked")) $(this).popover("show");
			$($(this).data("activate")).prop('disabled', false);
		}
		else
		{
			if ($(this).hasClass("activatePopoverOnChecked")) $(this).popover("hide");
			$($(this).data("activate")).prop('disabled', true);
		}
	});
	
	$(".activateOnCheck").on('ifChanged', function(e)
	{
		if (!$(this).parent().hasClass('checked'))
		{
			$($(this).data("activate")).removeClass("hidden");
		}
		else
		{
			$($(this).data("activate")).addClass("hidden");
		}
	});
	
	$(".activateOnCheck").each(function()
	{
		if ($(this).parent().hasClass('checked'))
		{
			$($(this).data("activate")).removeClass("hidden");
		}
		else
		{
			$($(this).data("activate")).addClass("hidden");
		}
	});
	
	$(".activateOnExeed").on('change keyup', function(e)
	{
		if (parseInt($(this).val()) > parseInt($(this).data("exeed")))
			$($(this).data("activate")).removeClass("hidden");
		else
			$($(this).data("activate")).addClass("hidden");
	});
	
	$(".activateOnSelected").on('change', function(e)
	{
		if ($(this).find("option:selected").data("activate") && $(this).find("option:selected").data("activate").length > 0)
		{
			$($(this).find("option:selected").data("activate")).removeClass("hidden");
		}
		else
		{
			$($(this).data("hidden")).addClass("hidden");
		}
	});
	
	$(".activateOnSelected").each(function()
	{
		if ($(this).find("option:selected").data("activate") && $(this).find("option:selected").data("activat").length > 0)
		{
			$($(this).find("option:selected").data("activate")).removeClass("hidden");
		}
		else
		{
			$($(this).data("hidden")).addClass("hidden");
		}
	});
	
	//Math
	$(".doMath").each(function()
	{
		var line = $(this);
		line.find("input").on("change, keyup", function()
		{
			var total = 0;
			line.find("input").each(function()
			{
				total += parseFloat($(this).val());
			});
			
			line.find(".mathTotal").html(total);
		});
	});
	
	//Validation
	$("input.required, textarea.required, select.required").change(function()
	{
		updateValidationMessage();
	});
	
	function updateValidationMessage()
	{
		var message = "";
		
		$("input.required, textarea.required, select.required").each(function()
		{
			if ($(this).val().length == 0) message += "Missing " + $(this).parent().find("label:first").html() + "<br>";
 		});
		
		$(".validationMessages").attr('data-content', message);
		if (message.length > 0)
			$(".validationMessages").addClass("btn-disabled");
		else
			$(".validationMessages").removeClass("btn-disabled");
	}
});