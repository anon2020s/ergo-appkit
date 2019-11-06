package org.ergoplatform.appkit;

/**
 * Global parameters used by Appkit library.
 */
public class Parameters {
    /**
     * A number of blocks a miner should wait before he/she can spend block reward.
     * This is part of Ergo protocol and cannot be changed.
     */
    public static final int MinerRewardDelay = 720;

    /**
     * One Erg is 10^9 NanoErg
     */
    public static final long OneErg = 1000 * 1000 * 1000;

    /**
     * Minimum transaction fee in NanoErgs as it is defined in Ergo protocol.
     */
    public static final long MinFee = 1000 * 1000;
}
