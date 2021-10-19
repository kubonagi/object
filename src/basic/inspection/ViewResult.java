package basic.inspection;

import java.util.ArrayList;
import java.util.List;

class ViewResult {
    public static void main(String[] args) {
        List<Result> resultList = new ArrayList<>();
        resultList.add(new Result(
                "202010110715",
                "久保渚",
                "2021-10-19T13:45:30",
                36.4,
                85,
                122,
                84
        ));

        for (Result result:resultList) {
            System.out.println(result);
        }
    }
}
