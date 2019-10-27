package org.ergoplatform.polyglot;

/**
 * Interface of the provers that can be used to sign {@link UnsignedTransaction}s.
 */
public interface ErgoProver {
    /**
     * Signs unsigned transaction by using configured secrets.
     * The prover can attach signatures (aka `proofs of knowledge`) to the inputs
     * spent by the given {@link UnsignedTransaction transaction}.
     *
     * @param tx transaction to be signed
     * @return new instance of {@link SignedTransaction} which contains necessary
     * proofs
     */
    SignedTransaction sign(UnsignedTransaction tx);
}
