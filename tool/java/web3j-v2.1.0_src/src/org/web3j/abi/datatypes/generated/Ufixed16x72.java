package org.web3j.abi.datatypes.generated;

import java.math.BigInteger;

import org.web3j.abi.datatypes.Ufixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link org.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Ufixed16x72 extends Ufixed {
  public static final Ufixed16x72 DEFAULT = new Ufixed16x72(BigInteger.ZERO);

  public Ufixed16x72(BigInteger value) {
    super(16, 72, value);
  }

  public Ufixed16x72(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
    super(16, 72, m, n);
  }
}
