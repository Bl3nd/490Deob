import java.io.EOFException;
import java.io.IOException;

final class qe {
	
	static md a;
	private ja b = null;
	static int c;
	private int d = '\ufde8';
	static ob e = rf.a(40, ")4lang)4de");
	static ob f = rf.a(40, "cookiehost");
	static pe cacheFile7;
	private int h;
	private ja i = null;
	static int j;
	static int k = 0;
	static int l;
	static int m;
	static short[][] n;
	static ca cacheFile_11;
	static ob p;
	private static ob q = rf.a(40, "No response from server)3");
	static byte[][][] r;
	static int s;
	static int t;
	
	final boolean a(boolean unused, int length, byte[] data, int clientScriptId) {
		try {
			++l;
			synchronized (this.b) {
				boolean flag;
				if (~length > -1 || ~this.d > ~length) {
					throw new IllegalArgumentException();
				}
				
				boolean flag2 = this.a(data, true, length, clientScriptId, 108);
				if (!flag2) {
					flag2 = this.a(data, false, length, clientScriptId, 71);
				}
				
				flag = flag2;
				return flag;
			}
		} catch (RuntimeException var12) {
			throw bc.a(var12, "qe.A(" + unused + ',' + length + ',' + (data != null ? "{...}" : "null") + ',' + clientScriptId + ')');
		}
	}
	
	final byte[] a(int var1, int clientScriptId) {
		int var17 = client.anInt_wb;
		
		try {
			++c;
			synchronized (this.b) {
				Object var3;
				try {
					if (~((long) (clientScriptId * 6 + 6)) < ~this.i.c(125)) {
						return null;
					}
					
					if (var1 <= 78) {
						r = null;
					}
					
					this.i.a((byte) 14, (long) (clientScriptId * 6));
					this.i.a(0, qf.G, 6, 5);
					int var6 = (qf.G[2] & 255) + (qf.G[0] << 16 & 16711680) - -(qf.G[1] << 8 & '\uff00');
					int var7 = (255 & qf.G[5]) + (qf.G[3] << 16 & 16711680) + ((255 & qf.G[4]) << 8);
					if (var6 >= 0 && ~var6 >= ~this.d) {
						if (~var7 < -1 && ~(this.b.c(125) / 520L) <= ~((long) var7)) {
							byte[] var8 = new byte[var6];
							int var9 = 0;
							int var10 = 0;
							byte[] var24;
							if (var9 >= var6) {
								var24 = var8;
								return var24;
							}
							
							do {
								if (~var7 == -1) {
									return null;
								}
								
								this.b.a((byte) 14, (long) (var7 * 520));
								int var11 = -var9 + var6;
								if (var11 > 512) {
									var11 = 512;
								}
								
								this.b.a(0, qf.G, var11 + 8, 5);
								int var12 = (qf.G[1] & 255) + ((qf.G[0] & 255) << 8);
								int var13 = ((qf.G[2] & 255) << 8) - -(255 & qf.G[3]);
								int var15 = 255 & qf.G[7];
								int var14 = (255 & qf.G[6]) + ((qf.G[5] & 255) << 8) + (qf.G[4] << 16 & 16711680);
								if (clientScriptId != var12 || ~var10 != ~var13 || var15 != this.h) {
									var3 = null;
									return (byte[]) var3;
								}
								
								if (var14 < 0 || this.b.c(116) / 520L < (long) var14) {
									var3 = null;
									return (byte[]) var3;
								}
								
								++var10;
								var7 = var14;
								int var16 = 0;
								if (var16 < var11) {
									do {
										var8[var9++] = qf.G[var16 + 8];
										++var16;
									} while (var16 < var11);
								}
							} while (var9 < var6);
							
							var24 = var8;
							return var24;
						}
						return null;
					}
					
					var3 = null;
				} catch (IOException var21) {
					return null;
				}
				
				return (byte[]) var3;
			}
		} catch (RuntimeException var23) {
			throw bc.a(var23, "qe.D(" + var1 + ',' + clientScriptId + ')');
		}
	}
	
	private boolean a(byte[] data, boolean flag, int length, int clientScriptId, int unused) {
		try {
			++j;
			synchronized (this.b) {
				boolean var6;
				try {
					int var9;
					if (flag) {
						if (~this.i.c(116) > ~((long) (6 * clientScriptId - -6))) {
							return false;
						}
						
						this.i.a((byte) 14, (long) (6 * clientScriptId));
						this.i.a(0, qf.G, 6, 5);
						var9 = ((qf.G[3] & 255) << 16) + ('\uff00' & qf.G[4] << 8) - -(qf.G[5] & 255);
						if (~var9 >= -1 || ~(this.b.c(125) / 520L) > ~((long) var9)) {
							return false;
						}
					} else {
						var9 = (int) ((519L + this.b.c(115)) / 520L);
						if (~var9 == -1) {
							var9 = 1;
						}
					}
					
					qf.G[1] = (byte) (length >> 8);
					qf.G[3] = (byte) (var9 >> 16);
					qf.G[4] = (byte) (var9 >> 8);
					qf.G[2] = (byte) length;
					qf.G[5] = (byte) var9;
					qf.G[0] = (byte) (length >> 16);
					this.i.a((byte) 14, (long) (clientScriptId * 6));
					int var10 = 0;
					this.i.a(qf.G, -3818, 0, 6);
					int var11 = 0;
					if (var10 < length) {
						do {
							int var12 = 0;
							int var13;
							if (flag) {
								this.b.a((byte) 14, (long) (520 * var9));

								try {
									this.b.a(0, qf.G, 8, 5);
								} catch (EOFException var21) {
									var21.printStackTrace();
									break;
								}

								var12 = (255 & qf.G[6]) + ((qf.G[5] & 255) << 8) + ((255 & qf.G[4]) << 16);
								var13 = (qf.G[1] & 255) + ('\uff00' & qf.G[0] << 8);
								int var14 = (qf.G[2] << 8 & '\uff00') + (255 & qf.G[3]);
								int var15 = qf.G[7] & 255;
								if (~var13 != ~clientScriptId || var14 != var11 || ~this.h != ~var15) {
									return false;
								}

								if (var12 < 0 || ~((long) var12) < ~(this.b.c(122) / 520L)) {
									return false;
								}
							}

							if (~var12 == -1) {
								flag = false;
								var12 = (int) ((this.b.c(115) - -519L) / 520L);
								if (~var12 == -1) {
									++var12;
								}

								if (~var9 == ~var12) {
									++var12;
								}
							}

							qf.G[2] = (byte) (var11 >> 8);
							qf.G[7] = (byte) this.h;
							if (~(-var10 + length) >= -513) {
								var12 = 0;
							}

							qf.G[4] = (byte) (var12 >> 16);
							qf.G[0] = (byte) (clientScriptId >> 8);
							qf.G[5] = (byte) (var12 >> 8);
							qf.G[3] = (byte) var11;
							++var11;
							qf.G[6] = (byte) var12;
							qf.G[1] = (byte) clientScriptId;
							var13 = -var10 + length;
							this.b.a((byte) 14, (long) (var9 * 520));
							if (~var13 < -513) {
								var13 = 512;
							}

							this.b.a(qf.G, -3818, 0, 8);
							this.b.a(data, -3818, var10, var13);
							var9 = var12;
							var10 += var13;
						} while (var10 < length);
					}

					return true;
				} catch (IOException var22) {
					var22.printStackTrace();
					return false;
				}
			}
			
		} catch (RuntimeException var24) {
			throw bc.a(var24, "qe.B(" + (data != null ? "{...}" : "null") + ',' + flag + ',' + length + ',' + clientScriptId + ',' + unused + ')');
		}
	}
	
	public static void a(boolean var0) {
		try {
			e = null;
			r = null;
			a = null;
			n = null;
			q = null;
			cacheFile_11 = null;
			cacheFile7 = null;
			p = null;
			f = null;
			if (!var0) {
				a = null;
			}
		} catch (RuntimeException var2) {
			throw bc.a(var2, "qe.C(" + var0 + ')');
		}
	}
	
	public final String toString() {
		try {
			++m;
			return "Cache:" + this.h;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "qe.toString(" + ')');
		}
	}
	
	qe(int i, ja class_ja, ja class_ja2, int i1) {
		try {
			this.h = i;
			this.b = class_ja;
			this.d = i1;
			this.i = class_ja2;
		} catch (RuntimeException e) {
			throw bc.a(e, "qe.<init>(" + i + ',' + (class_ja != null ? "{...}" : "null")
					+ ',' + (class_ja2 != null ? "{...}" : "null") + ',' + i1 + ')');
		}
	}
	
	static {
		p = q;
		n = new short[][] {{(short) 6798, (short) 107, (short) 10283, (short) 16, (short) 4797, (short) 7744, (short) 5799, (short) 4634, (short) -31839, (short) 22433, (short) 2983, (short) -11343, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010}, {(short) 8741, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404, (short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783, (short) 1341, (short) 16578, (short) -30533, (short) 25239, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010}, {(short) 25238, (short) 8742, (short) 12, (short) -1506, (short) -22374, (short) 7735, (short) 8404, (short) 1701, (short) -27106, (short) 24094, (short) 10153, (short) -8915, (short) 4783, (short) 1341, (short) 16578, (short) -30533, (short) 8, (short) 5281, (short) 10438, (short) 3650, (short) -27322, (short) -21845, (short) 200, (short) 571, (short) 908, (short) 21830, (short) 28946, (short) -15701, (short) -14010}, {(short) 4626, (short) 11146, (short) 6439, (short) 12, (short) 4758, (short) 10270}, {(short) 4550, (short) 4537, (short) 5681, (short) 5673, (short) 5790, (short) 6806, (short) 8076, (short) 4574}};
		r = new byte[4][104][104];
		a = new md(4096);
		t = 0;
	}
}
