package io.github.javagossip.opendsp.adx.spi;

import java.util.List;

import io.github.javagossip.opendsp.model.Advertiser;
import io.github.javagossip.opendsp.model.Creative;

public interface AdExchangeService {

    void createAdvertiser(Advertiser advertiser);

    void createCreative(Creative creative);

    void batchCreateAdvertisers(List<Advertiser> advertisers);

    void batchCreateCreatives(List<Creative> creatives);

}
