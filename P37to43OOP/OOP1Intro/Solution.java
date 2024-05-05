public class Solution {
  public static void main(String[] args) {
    
  }

  public interface ApiStatistics {
    long getTotalCount();
    long getSuccessCount();
    long getTotalElapsedMS();
    void update(ApiCall apiCall);
  }

  public interface ApiStatsAggregator {
    // record a call to the api, should be sued at the end of all external web requests
    void trackCall(ApiCall apiCall);

    // return: a roll-up of api usage data since the last call
    ApiStatistics getAndReset();
  }

  public class ApiCall {
    private final String action;
    private final Integer userID;
    private final long elapsedMS;
    private final boolean success;

    public ApiCall(String inputAction, Integer inputUserID, long inputElapsed, boolean inputSuccess) {
      this.action = inputAction;
      this.elapsedMS = inputElapsed;
      this.userID = inputUserID;
      this.success = inputSuccess;
    }

    public String getAction() {return action;}
    public Integer getUserID() {return userID;}
    public long getElapsedMS() {return elapsedMS;}
    public boolean isSUccess() {
      return success;
    }
  }


}
