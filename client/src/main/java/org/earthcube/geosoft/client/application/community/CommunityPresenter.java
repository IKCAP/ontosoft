package org.earthcube.geosoft.client.application.community;

import org.earthcube.geosoft.client.application.ApplicationPresenter;
import org.earthcube.geosoft.client.application.ParameterizedView;
import org.earthcube.geosoft.client.place.NameTokens;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

public class CommunityPresenter extends
    Presenter<CommunityPresenter.MyView, CommunityPresenter.MyProxy> {

  @ProxyStandard
  @NameToken(NameTokens.community)
  public interface MyProxy extends ProxyPlace<CommunityPresenter> {
  }

  public interface MyView extends ParameterizedView {
  }

  @Inject
  public CommunityPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
    super(eventBus, view, proxy, ApplicationPresenter.TYPE_SetMainContent);
  }
}
