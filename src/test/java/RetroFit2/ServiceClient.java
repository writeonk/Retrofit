package RetroFit2;

import RetroFit1.UserApiResponse;
import RetroFit1.UserService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ServiceClient {

    public void getUser(String userid, Callback<UserApiResponse> callback) {

        UserService service = ServiceGenerator.createService(UserService.class);

        Call<UserApiResponse> callAsync = service.getUser(2);

        callAsync.enqueue(callback);
    }
}
