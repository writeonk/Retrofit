package RetroFit2;

import RetroFit1.UserApiResponse;
import RetroFit1.UserService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserServiceClient {

    public static void main(String[] args) {

        UserService service = ServiceGenerator.createService(UserService.class);
        Call<UserApiResponse> callSync = service.getUser(5);

        try {
            Response<UserApiResponse> response = callSync.execute();
            UserApiResponse apiResponse = response.body();
            System.out.println(apiResponse);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}