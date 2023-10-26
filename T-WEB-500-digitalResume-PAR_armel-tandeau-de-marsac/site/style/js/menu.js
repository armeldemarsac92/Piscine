$(document).ready(function() {
    $(".outer-wrapper").scroll(function() {
      var wrapperScroll = $(".outer-wrapper").scrollLeft();
      $(".menu-item").each(function() {
        var hash = $(this).attr("href");
        var section = $(hash);
  
        // Get the position of the section relative to outer-wrapper
        var sectionLeft = section.offset().left - $(".outer-wrapper").offset().left;
        var sectionRight = sectionLeft + section.width();
  
        if ((sectionLeft <= wrapperScroll) && (sectionRight > wrapperScroll)) {
          $(this).addClass("active");
        } else {
          $(this).removeClass("active");
        }
      });
    });
  });
  