package RetroFit2;

import RetroFit1.UserApiResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserServiceClientASync {

    public static void main(String[] args) {

        ServiceClient service = new ServiceClient();
        service.getUser("2", new Callback<UserApiResponse>() {
            @Override
            public void onResponse(Call<UserApiResponse> call, Response<UserApiResponse> response) {
                System.out.println(response.body().data.toString());
                if (call.isExecuted()) {
                    System.out.println("Executed");
                    call.cancel();
                }
            }

            @Override
            public void onFailure(Call<UserApiResponse> call, Throwable t) {
                System.out.println("Test 2");
            }
        });
    }
}
