package com.tokbox.android.otsdkwrapper.listeners;

/**
 * Created by amac on 10/11/2016.
 */

public interface RetriableOTListener<Wrapper> {
  public BaseOTListener getInternalListener();
  public void resume();

}
