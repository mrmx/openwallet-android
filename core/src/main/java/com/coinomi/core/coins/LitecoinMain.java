package com.coinomi.core.coins;

import org.bitcoinj.core.Coin;

/**
 * @author Giannis Dzegoutanis
 */
public class LitecoinMain extends CoinType {
    private LitecoinMain() {
        id = "litecoin.main";
        uid = 21;

        addressHeader = 48;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };

        name = "Litecoin";
        symbol = "LTC";
        uriScheme = "litecoin";
        bip44Index = 2;
        feePerKb = Coin.valueOf(100000);
        minNonDust = Coin.valueOf(1000);
        unitExponent = 8;
    }

    private static LitecoinMain instance = new LitecoinMain();
    public static synchronized LitecoinMain get() {
        return instance;
    }
}
