final class kh extends rg {
	
	static int D;
	int E = -1;
	static int F;
	static kc H;
	private short[] I;
	private short[] J;
	static int K;
	static ob autoshadowOnCommand = rf.a(40, "::autoshadow on");
	static int M;
	private int N = 128;
	boolean O = false;
	private int P = 0;
	private int Q = 0;
	static int R = 0;
	private int S;
	int T;
	static int U;
	private int V = 0;
	static int W;
	private int X = 128;
	static byte[][] Y = new byte[50][];
	static int[] Z;
	private short[] ab;
	private short[] bb;
	
	final void a(int var1, og var2) {
		int var4 = client.anInt_wb;
		
		try {
			if (var1 != 13737) {
				f(53);
			}
			
			++U;
			
			do {
				int var3 = var2.readUnsignedByte(255);
				if (~var3 == -1) {
					break;
				}
				
				this.a(var3, var2, 1);
			} while (var4 == 0);
			
		} catch (RuntimeException var5) {
			throw bc.a(var5, "kh.G(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	final fe b(int var1, int var2) {
		int var6 = client.anInt_wb;
		
		try {
			if (var1 != 13557) {
				return null;
			} else {
				++W;
				fe var3 = (fe) ee.k.a((long) this.T, (byte) -97);
				if (var3 == null) {
					cb var4 = cb.a(qe.cacheFile7, this.S, 0);
					if (var4 == null) {
						return null;
					}
					
					int var5;
					if (this.J != null) {
						var5 = 0;
						if (var6 != 0 || this.J.length > var5) {
							do {
								var4.b(this.J[var5], this.bb[var5]);
								++var5;
							} while (this.J.length > var5);
						}
					}
					
					if (this.I != null) {
						var5 = 0;
						if (var6 != 0 || var5 < this.I.length) {
							do {
								var4.a(this.I[var5], this.ab[var5]);
								++var5;
							} while (var5 < this.I.length);
						}
					}
					
					var3 = var4.b(this.Q + 64, this.V + 850, -30, -50, -30);
					ee.k.a(var3, (byte) -43, (long) this.T);
				}
				
				fe var8;
				label55:
				{
					if (this.E != -1 && var2 != -1) {
						var8 = le.c(var1 ^ 2550, this.E).a(var3, (byte) -121, var2);
						if (var6 == 0) {
							break label55;
						}
					}
					
					var8 = var3.b(true);
				}
				
				if (~this.N != -129 || ~this.X != -129) {
					var8.c(this.N, this.X, this.N);
				}
				
				if (this.P != 0) {
					if (this.P == 90) {
						var8.d();
					}
					
					if (~this.P == -181) {
						var8.e();
					}
					
					if (this.P == 270) {
						var8.c();
					}
				}
				
				return var8;
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "kh.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	static ob a(byte var0, int var1, int radix, boolean var3) {
		try {
			++K;
			if (~radix <= -3 && radix <= 36) {
				int var5 = var1 / radix;
				int var4 = 1;
				while (var5 != 0) {
					++var4;
					var5 /= radix;
				}
				
				int length = var4;
				if (~var1 > -1 || var3) {
					length = var4 + 1;
				}
				
				byte[] data;
				data = new byte[length];
				if (~var1 <= -1) {
					if (var3) {
						data[0] = 43;
					}
				} else {
					data[0] = 45;
				}
				
				int var9 = 0;
				ob class_ob;
				if (var9 >= var4) {
					class_ob = new ob();
					class_ob.buffer = data;
					class_ob.length = length;
					return class_ob;
				} else {
					while (var9 < var4) {
						int var10 = var1 % radix;
						var1 /= radix;
						if (~var10 > -1) {
							var10 = -var10;
						}
						
						if (var10 > 9) {
							var10 += 39;
						}
						
						data[length - var9 - 1] = (byte) (var10 + 48);
						++var9;
					}
					
					class_ob = new ob();
					class_ob.buffer = data;
					class_ob.length = length;
					return class_ob;
				}
			} else {
				throw new IllegalArgumentException("Invalid radix:" + radix);
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "kh.D(" + var0 + ',' + var1 + ',' + radix + ',' + var3 + ')');
		}
	}
	
	static byte[] a(byte[] bytes, int unused) {
		try {
			++F;
			og var2 = new og(bytes);
			int var3 = var2.readUnsignedByte(255);
			int var4 = var2.readInt(1029109968);
			if (var4 >= 0 && (fc.Pb == 0 || ~fc.Pb <= ~var4)) {
				if (unused <= 79) {
					Z = null;
				}
				
				if (var3 == 0) {
					byte[] var8 = new byte[var4];
					var2.readBytes(var4, 0, 99, var8);
					return var8;
				} else {
					int var5 = var2.readInt(1029109968);
					if (~var5 > -1 || ~fc.Pb != -1 && fc.Pb < var5) {
						//throw new RuntimeException();
						return new byte[100];
					} else {
						byte[] var6 = new byte[var5];
						if (~var3 != -2) {
							gb.R.a(var6, var2, (byte) 117);
						} else {
							rb.a(var6, var5, bytes, var4, 9);
						}
						
						return var6;
					}
				}
			} else {
				return new byte[100];
				//throw new RuntimeException();
			}
		} catch (RuntimeException var7) {
			var7.printStackTrace();
			throw bc.a(var7, "kh.C(" + (bytes != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	static i a(byte[] var0, byte var1) {
		try {
			++D;
			if (var0 == null) {
				return null;
			} else {
				i var2 = new i(var0, ci.A, ci.x, ub.g, le.db, be.h, wg.V);
				if (var1 != 45) {
					H = null;
				}
				
				ii.e(-128);
				return var2;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "kh.E(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}
	
	public static void f(int var0) {
		try {
			Y = null;
			H = null;
			autoshadowOnCommand = null;
			Z = null;
			if (var0 >= -111) {
				a((byte) -41, -22, 38, false);
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "kh.A(" + var0 + ')');
		}
	}
	
	private final void a(int var1, og var2, int var3) {
		int var6 = client.anInt_wb;
		
		try {
			++M;
			if (var1 == var3) {
				this.S = var2.readShort(120);
			} else if (~var1 == -3) {
				this.E = var2.readShort(75);
			} else if (~var1 != -5) {
				if (var1 == 5) {
					this.X = var2.readShort(85);
				} else if (var1 != 6) {
					if (var1 == 7) {
						this.Q = var2.readUnsignedByte(var3 ^ 254);
					} else if (var1 != 8) {
						if (~var1 == -10) {
							this.O = true;
						} else {
							int var4;
							int var5;
							if (~var1 != -41) {
								if (~var1 == -42) {
									var4 = var2.readUnsignedByte(255);
									this.I = new short[var4];
									this.ab = new short[var4];
									var5 = 0;
									if (var6 == 0 && ~var4 >= ~var5) {
										return;
									}
									
									do {
										this.I[var5] = (short) var2.readShort(53);
										this.ab[var5] = (short) var2.readShort(107);
										++var5;
									} while (~var4 < ~var5);
									
									return;
								}
							} else {
								var4 = var2.readUnsignedByte(255);
								this.J = new short[var4];
								this.bb = new short[var4];
								var5 = 0;
								if (var6 != 0 || ~var4 < ~var5) {
									do {
										this.J[var5] = (short) var2.readShort(126);
										this.bb[var5] = (short) var2.readShort(113);
										++var5;
									} while (~var4 < ~var5);
								}
							}
							
						}
					} else {
						this.V = var2.readUnsignedByte(255);
					}
				} else {
					this.P = var2.readShort(var3 + 69);
				}
			} else {
				this.N = var2.readShort(39);
			}
		} catch (RuntimeException var7) {
			throw bc.a(var7, "kh.B(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}
}
