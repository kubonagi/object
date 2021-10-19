package basic.inspection;

import java.util.ArrayList;
import java.util.List;

class ViewResult {
    public static void main(String[] args) {
        List<Result> resultList = new ArrayList<>();
        resultList.add(new Result(
                "202010110910",
                "久保渚",
                "2021-07-15T13:45:30",
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
