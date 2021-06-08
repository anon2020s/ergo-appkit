package org.ergoplatform.explorer.client;

import org.ergoplatform.explorer.client.ExplorerApiClient;
import org.ergoplatform.explorer.client.model.BadRequest;
import org.ergoplatform.explorer.client.model.Balance;
import org.ergoplatform.explorer.client.model.BlockSummary;
import org.ergoplatform.explorer.client.model.BoxQuery;
import org.ergoplatform.explorer.client.model.EpochParameters;
import org.ergoplatform.explorer.client.model.ItemsA;
import org.ergoplatform.explorer.client.model.ListOutputInfo;
import org.ergoplatform.explorer.client.model.NotFound;
import org.ergoplatform.explorer.client.model.OutputInfo;
import org.ergoplatform.explorer.client.model.TokenInfo;
import org.ergoplatform.explorer.client.model.TotalBalance;
import org.ergoplatform.explorer.client.model.TransactionInfo;
import org.ergoplatform.explorer.client.model.UnknownErr;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * API tests for DefaultApi
 */
public class DefaultApiTest {
    private DefaultApi api;

    @Before
    public void setup() {
        api = new ExplorerApiClient("https://api.ergoplatform.com")
            .createService(DefaultApi.class);
    }

    String address = "9hHDQb26AjnJUXxcqriqY1mnhpLuUeC81C4pggtK7tupr92Ea1K";

    /** NFT: Blockchain whales #02 */
    String tokenId = "7970bba36de5d4d6b9c24c20dc65d764ebf7d4aeb5eeb01bbe94221aa03fee45";

    String blockId = "78a76fb6c8ac11e7e9da01f2c916b82dd1220a370d7fcfe2df94caa675c21926";

    @Test
    public void getApiV1AddressesP1BalanceConfirmedTest() throws IOException {
        Integer minConfirmations = 1;
        Balance response = api.getApiV1AddressesP1BalanceConfirmed(address, minConfirmations).execute().body();
        assertNotNull(response);
        assertTrue(response.getNanoErgs() > 0);
    }

    @Test
    public void getApiV1AddressesP1BalanceTotalTest() throws IOException {
        TotalBalance response = api.getApiV1AddressesP1BalanceTotal(address).execute().body();
        assertTrue(response.getConfirmed().getNanoErgs() > 0);
    }

    @Test
    public void getApiV1AddressesP1TransactionsTest() throws IOException {
        Integer offset = 0;
        Integer limit = 10;
        ItemsA response = api.getApiV1AddressesP1Transactions(address, offset, limit).execute().body();
        assertTrue(response.getItems().size() > 0);
    }

    @Test
    public void getApiV1AssetsTest() throws IOException {
        Integer offset = 0;
        Integer limit = 10;
        String sortDirection = null;
        Boolean hideNfts = null;
        ItemsA response = api.getApiV1Assets(offset, limit, sortDirection, hideNfts).execute().body();
        assertTrue(response.getItems().size() > 0);
    }

    @Test
    public void getApiV1AssetsSearchBytokenidTest() throws IOException {
        Integer offset = 0;
        Integer limit = 10;
        ItemsA response = api.getApiV1AssetsSearchBytokenid(tokenId, offset, limit).execute().body();
        assertTrue(response.getItems().size() > 0);
    }

    @Test
    public void getApiV1BlocksTest() throws IOException {
        Integer offset = 0;
        Integer limit = 10;
        String sortBy = null;
        String sortDirection = null;
        ItemsA response = api.getApiV1Blocks(offset, limit, sortBy, sortDirection).execute().body();
        assertTrue(response.getItems().size() > 0);
    }

    @Test
    public void getApiV1BlocksP1Test() throws IOException {
        BlockSummary response = api.getApiV1BlocksP1(blockId).execute().body();
        assertTrue(response.getBlock().getBlockTransactions().size() > 0);
    }

    @Test
    public void getApiV1BoxesByaddressP1Test() {
        String p1 = null;
        Integer offset = null;
        Integer limit = null;
        // ItemsA response = api.getApiV1BoxesByaddressP1(p1, offset, limit);
    }

    @Test
    public void getApiV1BoxesByergotreeP1Test() {
        String p1 = null;
        Integer offset = null;
        Integer limit = null;
        // ItemsA response = api.getApiV1BoxesByergotreeP1(p1, offset, limit);
    }

    @Test
    public void getApiV1BoxesByergotreetemplatehashP1Test() {
        String p1 = null;
        Integer offset = null;
        Integer limit = null;
        // ItemsA response = api.getApiV1BoxesByergotreetemplatehashP1(p1, offset, limit);
    }

    @Test
    public void getApiV1BoxesByergotreetemplatehashP1StreamTest() {
        String p1 = null;
        Integer minHeight = null;
        Integer maxHeight = null;
        // ListOutputInfo response = api.getApiV1BoxesByergotreetemplatehashP1Stream(p1, minHeight, maxHeight);
    }

    @Test
    public void getApiV1BoxesBytokenidP1Test() {
        String p1 = null;
        Integer offset = null;
        Integer limit = null;
        // ItemsA response = api.getApiV1BoxesBytokenidP1(p1, offset, limit);
    }

    @Test
    public void getApiV1BoxesP1Test() {
        String p1 = null;
        // OutputInfo response = api.getApiV1BoxesP1(p1);
    }

    @Test
    public void getApiV1BoxesUnspentByaddressP1Test() {
        String p1 = null;
        Integer offset = null;
        Integer limit = null;
        // ItemsA response = api.getApiV1BoxesUnspentByaddressP1(p1, offset, limit);
    }

    @Test
    public void getApiV1BoxesUnspentByergotreeP1Test() {
        String p1 = null;
        Integer offset = null;
        Integer limit = null;
        // ItemsA response = api.getApiV1BoxesUnspentByergotreeP1(p1, offset, limit);
    }

    @Test
    public void getApiV1BoxesUnspentByergotreetemplatehashP1Test() {
        String p1 = null;
        Integer offset = null;
        Integer limit = null;
        // ItemsA response = api.getApiV1BoxesUnspentByergotreetemplatehashP1(p1, offset, limit);
    }

    @Test
    public void getApiV1BoxesUnspentByergotreetemplatehashP1StreamTest() {
        String p1 = null;
        Integer minHeight = null;
        Integer maxHeight = null;
        // ListOutputInfo response = api.getApiV1BoxesUnspentByergotreetemplatehashP1Stream(p1, minHeight, maxHeight);
    }

    @Test
    public void getApiV1BoxesUnspentBylastepochsStreamTest() {
        Integer lastEpochs = null;
        // ListOutputInfo response = api.getApiV1BoxesUnspentBylastepochsStream(lastEpochs);
    }

    @Test
    public void getApiV1BoxesUnspentBytokenidP1Test() {
        String p1 = null;
        Integer offset = null;
        Integer limit = null;
        // ItemsA response = api.getApiV1BoxesUnspentBytokenidP1(p1, offset, limit);
    }

    @Test
    public void getApiV1BoxesUnspentStreamTest() {
        Integer minHeight = null;
        Integer maxHeight = null;
        // ListOutputInfo response = api.getApiV1BoxesUnspentStream(minHeight, maxHeight);
    }

    @Test
    public void getApiV1EpochsParamsTest() {
        // EpochParameters response = api.getApiV1EpochsParams();
    }

    @Test
    public void getApiV1TokensTest() {
        Integer offset = null;
        Integer limit = null;
        String sortDirection = null;
        Boolean hideNfts = null;
        // ItemsA response = api.getApiV1Tokens(offset, limit, sortDirection, hideNfts);
    }

    @Test
    public void getApiV1TokensP1Test() {
        String p1 = null;
        // TokenInfo response = api.getApiV1TokensP1(p1);

        // TODO: test validations
    }

    @Test
    public void getApiV1TokensSearchTest() {
        String query = null;
        Integer offset = null;
        Integer limit = null;
        // ItemsA response = api.getApiV1TokensSearch(query, offset, limit);

        // TODO: test validations
    }

    @Test
    public void getApiV1TransactionsByinputsscripttemplatehashP1Test() {
        String p1 = null;
        Integer offset = null;
        Integer limit = null;
        String sortDirection = null;
        // ItemsA response = api.getApiV1TransactionsByinputsscripttemplatehashP1(p1, offset, limit, sortDirection);

        // TODO: test validations
    }

    @Test
    public void getApiV1TransactionsP1Test() {
        String p1 = null;
        // TransactionInfo response = api.getApiV1TransactionsP1(p1);

        // TODO: test validations
    }

    @Test
    public void postApiV1BoxesSearchTest() {
        BoxQuery body = null;
        Integer offset = null;
        Integer limit = null;
        // ItemsA response = api.postApiV1BoxesSearch(body, offset, limit);

        // TODO: test validations
    }
}
