package com.example.codeeditor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.ncorti.slidetoact.SlideToActView;

import maes.tech.intentanim.CustomIntent;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView user_code;
    SlideToActView run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        user_code = findViewById(R.id.user_code);  //represents auto complete text i.e text box
        run = findViewById(R.id.run);



        run.setOnSlideCompleteListener(new SlideToActView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(SlideToActView slideToActView) {
                Run();
                run.resetSlider();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }


    @SuppressLint("SetTextI18n")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.run:
                Run();
                return true;


            case R.id.add_html:

                user_code.setText("<!DOCTYPE HTML>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<title> </title>\n" +
                        "\n" +
                        "</head>\n" +
                        "\n" +
                        "<body>\n" +
                        "\n" +
                        "</body>\n" +
                        "<image src=\"res/drawable-v24/rose.jpeg\">\n" +
                        "</html>");

                return true;

            case R.id.clear:

                user_code.setText("");
                return true;

            case R.id.add_table:

                user_code.setText("\u200B<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "</head>\n" + "<style>\n" +
                                "table, th, td {\n" +
                                "  border: 1px solid black;\n" +
                                "}\n" +
                                "</style>"+
                        "<body bgcolor=pink>\n" +
                        "\n" +
                        "<h2>Table With Border</h2>\n" +
                        "\n" +
                        "<p>Use the CSS border property to add a border to the table.</p>\n" +
                        "\n" +
                        "<table style=\"width:100%\">\n" +
                        "  <tr>\n" +
                        "    <th>Firstname</th>\n" +
                        "    <th>Lastname</th> \n" +
                        "    <th>Age</th>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>Ruhi</td>\n" +
                        "    <td>Singh</td>\n" +
                        "    <td>50</td>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>Sophia</td>\n" +
                        "    <td>Joseph</td>\n" +
                        "    <td>94</td>\n" +
                        "  </tr>\n" +
                        "  <tr>\n" +
                        "    <td>Shikha</td>\n" +
                        "    <td>Verma</td>\n" +
                        "    <td>80</td>\n" +
                        "  </tr>\n" +
                        "</table>\n" +
                        "\n" +  "<div id=\"grad1\"></div>\n"+
                        "</body>\n" +
                        "</html>\n");
                return true;



            case R.id.add_form:
                user_code.setText("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<style>\n" +
                        "input[type=text], select {\n" +
                        "  width: 100%;\n" +
                        "  padding: 12px 20px;\n" +
                        "  margin: 8px 0;\n" +
                        "  display: inline-block;\n" +
                        "  border: 1px solid #ccc;\n" +
                        "  border-radius: 4px;\n" +
                        "  box-sizing: border-box;\n" +
                        "}\n" +
                        "\n" +
                        "input[type=submit] {\n" +
                        "  width: 100%;\n" +
                        "  background-color: #4CAF50;\n" +
                        "  color: white;\n" +
                        "  padding: 14px 20px;\n" +
                        "  margin: 8px 0;\n" +
                        "  border: none;\n" +
                        "  border-radius: 4px;\n" +
                        "  cursor: pointer;\n" +
                        "}\n" +
                        "\n" +
                        "input[type=submit]:hover {\n" +
                        "  background-color: #45a049;\n" +
                        "}\n" +
                        "\n" +
                        "div {\n" +
                        "  border-radius: 5px;\n" +
                        "  background-color: #f2f2f2;\n" +
                        "  padding: 20px;\n" +
                        "}\n" +
                        "</style>\n" +
                        "<body bgcolor=purple>\n" +
                        "\n" +
                        "<h3>Using CSS to style an HTML Form</h3>\n" +
                        "\n" +
                        "<div>\n" +
                        "  <form action=\"/action_page.php\">\n" +
                        "    <label for=\"fname\">First Name</label>\n" +
                        "    <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"Your name..\">\n" +
                        "\n" +
                        "    <label for=\"lname\">Last Name</label>\n" +
                        "    <input type=\"text\" id=\"lname\" name=\"lastname\" placeholder=\"Your last name..\">\n" +
                        "\n" +
                        "    <label for=\"country\">Country</label>\n" +
                        "    <select id=\"country\" name=\"country\">\n" +
                        "      <option value=\"india\">India</option>\n" +
                        "      <option value=\"canada\">Canada</option>\n" +
                        "      <option value=\"usa\">USA</option>\n" +
                        "    </select>\n" +
                        "  \n" +
                        "    <input type=\"submit\" value=\"Submit\">\n" +
                        "  </form>\n" +
                        "</div>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>\n");
                return true;

            case R.id.add_image:
                Toast.makeText(this,"Opening Options to add Images",Toast.LENGTH_SHORT).show();
                return true;

            case R.id.subitem1:
                user_code.setText("<!DOCTYPE HTML>" +
                       " <html> \n " +
                        "<head>\n"+
            "<title> </title>\n"+
                        "</head>\n" +
                        "<body> <I><B> This is a beautiful White Rose, So Peace giving and soothing to eyes!! <BR> <h2><marquee><span style=\"color:blue\">WISHING YOU A GREAT DAY AHEAD! </span></marquee></h2></BR></I></B>\n"+
                        "<a href=\"https://drive.google.com/uc?export=view&id=1nZmeJS3ZKNwogdQcLicwHtUMs5iY1nTq\">\n" +
                                "    <img src=\"https://drive.google.com/uc?export=view&id=1nZmeJS3ZKNwogdQcLicwHtUMs5iY1nTq\"\n" +
                                "    style=\"width: 500px; max-width: 100%; height: auto\"\n" +
                                "    title=\"Click for the larger version.\" />\n" +
                                "</a>"+
                        "</body>\n"+
                        "</html>\n");

                return true;

            case  R.id.subitem2:
                user_code.setText("<!DOCTYPE HTML>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<title> </title>\n" +
                        "</head>\n" +
                        "<body> <I><B> This is an awesome car!! <BR> <h2><marquee><span style=\"color:green\">WISHING YOU A GREAT DAY AHEAD! </span></marquee></h2></BR></I></B>\n" +
                        "<a href=\"https://drive.google.com/uc?export=view&id=1oubmx5wwsdnTAOVaXWlaCss28rN4NOCt\">\n" +
                        "<img src=\"https://drive.google.com/uc?export=view&id=1oubmx5wwsdnTAOVaXWlaCss28rN4NOCt\"\n" +
                        "style=\"width: 500px; max-width: 100%; height: auto\"\n" +
                        "title=\"Click for the larger version.\" />\n" +
                        "</a>\n" +
                        "</body>\n" +
                        "</html>");
                return true;

            case R.id.subitem3:
                user_code.setText("<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +

                        "<body>\n" +
                        "\n" +
                        "<h2 style=\"text-align:center\">Nature Gallery</h2>\n" +
                        "\n" +
                        "<div class=\"container\">\n" +
                        "  <div class=\"mySlides\">\n" +
                        "    <div class=\"numbertext\">1 / 6</div>\n" +
                        "    <a href=\"https://drive.google.com/uc?export=view&id=1wWvmQmYXDwb_xiptn0VM2b_uljJ1aG0a\">\n" +
                        "    <img src=\"https://drive.google.com/uc?export=view&id=1wWvmQmYXDwb_xiptn0VM2b_uljJ1aG0a\"\n" +
                        "    style=\"width: 500px; max-width: 100%; height: auto\"\n" +
                        "    title=\"Click for the larger version.\" />\n" +
                        "</a>\n" +
                        "  </div>\n" +
                        "\n" +
                        "  <div class=\"mySlides\">\n" +
                        "    <div class=\"numbertext\">2 / 6</div>\n" +
                        "    <a href=\"https://drive.google.com/uc?export=view&id=1Hwyjv5aC1OufWAipvwW9lkf7OV43PxDn\">\n" +
                        "    <img src=\"https://drive.google.com/uc?export=view&id=1Hwyjv5aC1OufWAipvwW9lkf7OV43PxDn\"\n" +
                        "    style=\"width: 500px; max-width: 100%; height: auto\"\n" +
                        "    title=\"Click for the larger version.\" />\n" +
                        "</a>\n" +
                        "  </div>\n" +
                        "\n" +
                        "  <div class=\"mySlides\">\n" +
                        "    <div class=\"numbertext\">3 / 6</div>\n" +
                        "    <a href=\"https://drive.google.com/uc?export=view&id=1O6Ma7dUQCj73FyTZ48h9swygAeDnx9oQ\">\n" +
                        "    <img src=\"https://drive.google.com/uc?export=view&id=1O6Ma7dUQCj73FyTZ48h9swygAeDnx9oQ\"\n" +
                        "    style=\"width: 500px; max-width: 100%; height: auto\"\n" +
                        "    title=\"Click for the larger version.\" />\n" +
                        "</a>\n" +
                        "  </div>\n" +
                        "    \n" +
                        "  <div class=\"mySlides\">\n" +
                        "    <div class=\"numbertext\">4 / 6</div>\n" +
                        "    <a href=\"https://drive.google.com/uc?export=view&id=1Pft7ogH6xHOp_Xc4FK-pIyg23PbaARqF\">\n" +
                        "    <img src=\"https://drive.google.com/uc?export=view&id=1Pft7ogH6xHOp_Xc4FK-pIyg23PbaARqF\"\n" +
                        "    style=\"width: 500px; max-width: 100%; height: auto\"\n" +
                        "    title=\"Click for the larger version.\" />\n" +
                        "</a>\n" +
                        "  </div>\n" +
                        "\n" +
                        "  <div class=\"mySlides\">\n" +
                        "    <div class=\"numbertext\">5 / 6</div>\n" +
                        "     <a href=\"https://drive.google.com/uc?export=view&id=1R5xM4DRiw97_jcg-VILCKAk7cJj3tJ1r\">\n" +
                        "    <img src=\"https://drive.google.com/uc?export=view&id=1R5xM4DRiw97_jcg-VILCKAk7cJj3tJ1r\"\n" +
                        "    style=\"width: 500px; max-width: 100%; height: auto\"\n" +
                        "    title=\"Click for the larger version.\" />\n" +
                        "</a>\n" +
                        "  </div>\n" +
                        "    \n" +
                        "  <div class=\"mySlides\">\n" +
                        "    <div class=\"numbertext\">6 / 6</div>\n" +
                        "    <a href=\"https://drive.google.com/uc?export=view&id=1JgbPnLuEpP_XCgwXk_6DgibfSwUZupV2\">\n" +
                        "    <img src=\"https://drive.google.com/uc?export=view&id=1JgbPnLuEpP_XCgwXk_6DgibfSwUZupV2\"\n" +
                        "    style=\"width: 500px; max-width: 100%; height: auto\"\n" +
                        "    title=\"Click for the larger version.\" />\n" +
                        "</a>\n" +
                        "  </div>\n" +
                        "    \n" +
                        "  <a class=\"prev\" onclick=\"plusSlides(-1)\">❮</a>\n" +
                        "  <a class=\"next\" onclick=\"plusSlides(1)\">❯</a>\n" +
                        "\n" +
                        "  <div class=\"caption-container\">\n" +
                        "    <p id=\"caption\"></p>\n" +
                        "  </div>\n" +
                        "\n" +
                        "  <div class=\"row\">\n" +
                        "    <div class=\"column\">\n" +
                        "      <a href=\"https://drive.google.com/uc?export=view&id=1wWvmQmYXDwb_xiptn0VM2b_uljJ1aG0a\">\n" +
                        "    <img class=\"demo cursor\" src=\"https://drive.google.com/uc?export=view&id=1wWvmQmYXDwb_xiptn0VM2b_uljJ1aG0a\"\n" +
                        "    style=\"width: auto; max-width: 100%; height: auto; onclick=\"currentSlide(1)\" alt=\"The Woods\"\"\n" +
                        "    title=\"Click for the larger version.\" />\n" +
                        "</a>\n" +
                        "    </div>\n" +
                        "    <div class=\"column\">\n" +
                        "     <a href=\"https://drive.google.com/uc?export=view&id=1Hwyjv5aC1OufWAipvwW9lkf7OV43PxDn\">\n" +
                        "    <img class=\"demo cursor\" src=\"https://drive.google.com/uc?export=view&id=1Hwyjv5aC1OufWAipvwW9lkf7OV43PxDn\"\n" +
                        "    style=\"width: auto; max-width: 100%; height: auto; onclick=\"currentSlide(2)\" alt=\"Cinque Terre\"\"\n" +
                        "    title=\"Click for the larger version.\" />\n" +
                        "</a>\n" +
                        "    </div>\n" +
                        "    <div class=\"column\">\n" +
                        "       <a href=\"https://drive.google.com/uc?export=view&id=1O6Ma7dUQCj73FyTZ48h9swygAeDnx9oQ\">\n" +
                        "    <img class=\"demo cursor\" src=\"https://drive.google.com/uc?export=view&id=1O6Ma7dUQCj73FyTZ48h9swygAeDnx9oQ\"\n" +
                        "    style=\"width: 500px; max-width: 100%; height: auto; onclick=\"currentSlide(3)\" alt=\"Mountains\"\"\n" +
                        "    title=\"Click for the larger version.\" />\n" +
                        "</a>\n" +
                        "    </div>\n" +
                        "    <div class=\"column\">\n" +
                        "     <a href=\"https://drive.google.com/uc?export=view&id=1Pft7ogH6xHOp_Xc4FK-pIyg23PbaARqF\">\n" +
                        "    <img class=\"demo cursor\" src=\"https://drive.google.com/uc?export=view&id=1Pft7ogH6xHOp_Xc4FK-pIyg23PbaARqF\"\n" +
                        "    style=\"width: 500px; max-width: 100%; height: auto; onclick=\"currentSlide(4)\" alt=\"Nature and sunrise\"\"\n" +
                        "    title=\"Click for the larger version.\" />\n" +
                        "</a>\n" +
                        "    </div>\n" +
                        "    <div class=\"column\">\n" +
                        "       <a href=\"https://drive.google.com/uc?export=view&id=1R5xM4DRiw97_jcg-VILCKAk7cJj3tJ1r\">\n" +
                        "    <img class=\"demo cursor\" src=\"https://drive.google.com/uc?export=view&id=1R5xM4DRiw97_jcg-VILCKAk7cJj3tJ1r\"\n" +
                        "    style=\"width: 500px; max-width: 100%; height: auto; onclick=\"currentSlide(5)\" alt=\"Nature and sunrise\"\"\n" +
                        "    title=\"Click for the larger version.\" />\n" +
                        "</a>\n" +
                        "     \n" +
                        "    </div>    \n" +
                        "    <div class=\"column\">\n" +
                        "      <a href=\"https://drive.google.com/uc?export=view&id=1JgbPnLuEpP_XCgwXk_6DgibfSwUZupV2\">\n" +
                        "    <img lass=\"demo cursor\" src=\"https://drive.google.com/uc?export=view&id=1JgbPnLuEpP_XCgwXk_6DgibfSwUZupV2\"\n" +
                        "    style=\"width: 500px; max-width: 100%; height: auto; onclick=\"currentSlide(6)\" alt=\"Snowy Mountains\"\"\n" +
                        "    title=\"Click for the larger version.\" />\n" +
                        "</a>\n" +
                        "    </div>\n" +
                        "  </div>\n" +
                        "</div>\n" +
                        "\n" +
                        "<script>\n" +
                        "var slideIndex = 1;\n" +
                        "showSlides(slideIndex);\n" +
                        "\n" +
                        "function plusSlides(n) {\n" +
                        "  showSlides(slideIndex += n);\n" +
                        "}\n" +
                        "\n" +
                        "function currentSlide(n) {\n" +
                        "  showSlides(slideIndex = n);\n" +
                        "}\n" +
                        "\n" +
                        "function showSlides(n) {\n" +
                        "  var i;\n" +
                        "  var slides = document.getElementsByClassName(\"mySlides\");\n" +
                        "  var dots = document.getElementsByClassName(\"demo\");\n" +
                        "  var captionText = document.getElementById(\"caption\");\n" +
                        "  if (n > slides.length) {slideIndex = 1}\n" +
                        "  if (n < 1) {slideIndex = slides.length}\n" +
                        "  for (i = 0; i < slides.length; i++) {\n" +
                        "      slides[i].style.display = \"none\";\n" +
                        "  }\n" +
                        "  for (i = 0; i < dots.length; i++) {\n" +
                        "      dots[i].className = dots[i].className.replace(\" active\", \"\");\n" +
                        "  }\n" +
                        "  slides[slideIndex-1].style.display = \"block\";\n" +
                        "  dots[slideIndex-1].className += \" active\";\n" +
                        "  captionText.innerHTML = dots[slideIndex-1].alt;\n" +
                        "}\n" +
                        "</script>\n" +
                        "    \n" +
                        "</body>\n" +
                        "</html>\n");
                return true;


            case R.id.close:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void Run(){
        Intent intent = new Intent(MainActivity.this,Code_activity.class);
        intent.putExtra("code",user_code.getText().toString());
        startActivity(intent);
        CustomIntent.customType(MainActivity.this,"bottom-to-up");
    }
}