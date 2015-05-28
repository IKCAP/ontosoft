package org.earthcube.geosoft.client.application.training;

import org.earthcube.geosoft.client.application.ApplicationPresenter;
import org.earthcube.geosoft.client.application.ParameterizedView;
import org.earthcube.geosoft.client.place.NameTokens;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

public class TrainingPresenter extends
    Presenter<TrainingPresenter.MyView, TrainingPresenter.MyProxy> {

  @ProxyCodeSplit
  @NameToken(NameTokens.training)
  public interface MyProxy extends ProxyPlace<TrainingPresenter> {
  }

  public interface MyView extends ParameterizedView {
  }

  @Inject
  public TrainingPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
    super(eventBus, view, proxy, ApplicationPresenter.TYPE_SetMainContent);
  }
}
