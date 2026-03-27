package http.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Weathers {

    private List<Weather> weather;

    @Data
    public class Weather{
        private String description;

    }
//    @Data
//    @NoArgsConstructor
//    public static class Coord {
//        private double lon;
//        private double lat;
//    }

//    @Data
//    @NoArgsConstructor
//    public static class Weather {
//        //private List<> item;
//        private int id;
//        private String main;
//        private String description;
//
//    }


}
