<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script>
    function myMap() {
        var mapCanvas = document.getElementById("map");
        var mapOptions = {
            // center: new google.maps.LatLng(51.5, -0.2), zoom: 5
            center: new google.maps.LatLng(51.5, -0.2), zoom: 5
        };
        var map = new google.maps.Map(mapCanvas, mapOptions);
    }
</script>
<br><br>
<section>
    <div class="container-fluid">
<%--                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d634.4701814499168!2d30.57984082926153!3d50.49917759871765!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x40d4d1b736ea4fcd%3A0xc85de22107fa850c!2z0JrRgNC-0YXQsA!5e0!3m2!1sen!2sua!4v1535890843597"--%>
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d634.4701814499168!2d30.5805331!3d50.4992237!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x40d4d1b736ea4fcd%3A0xc85de22107fa850c!2z0JrRgNC-0YXQsA!5e0!3m2!1sen!2sua!4v1535890843597"
                        width="100%" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>
                </iframe>
            </div>
</section>
<br>
