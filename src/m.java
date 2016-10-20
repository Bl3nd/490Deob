final class m extends dc {
	
	static int n;
	static int o;
	static ob clanRequest = rf.a(40, ":clanreq:");
	static int anInt_q;
	static int r;
	private final int s;
	private final int t;
	private final int u;
	private final int v;
	static ob w = rf.a(40, "Passwort: ");
	static int[] x = new int[] {-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
	static int y;
	static ob z = rf.a(40, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");
	static int A;
	static int B = -1;
	static pe cacheFile6;
	static int D = 0;
	static int E;
	
	static void b(byte var0) {
		int var10 = client.anInt_wb;
		
		try {
			++E;
			int var1 = 0;
			if (var10 == 0 && dh.k <= var1) {
				label139:
				{
					if (li.aBoolean_q && !jc.k(15734)) {
						if (bc.mb != 0 && ~sc.g != 0) {
							ac.a(false, sc.g, true, q.cacheFile_6, 0, bc.mb);
						}
						
						li.aBoolean_q = false;
						if (var10 == 0) {
							break label139;
						}
					}
					
					if (bc.mb != 0 && ~sc.g != 0 && !jc.k(15734)) {
						++pg.T;
						af.P.p(136, 12885);
						af.P.writeInt(sc.g, (byte) -125);
						sc.g = -1;
					}
				}
				
				if (var0 <= 58) {
					a(false, (Object) null, false);
				}
			} else {
				do {
					--eh.Y[var1];
					if (eh.Y[var1] < -10) {
						--dh.k;
						int var2 = var1;
						if (var10 != 0) {
							ri.k[var1] = ri.k[1 + var1];
							ke.rb[var1] = ke.rb[var1 + 1];
							ii.G[var1] = ii.G[var1 - -1];
							eh.Y[var1] = eh.Y[var1 - -1];
							kg.o[var1] = kg.o[var1 + 1];
							var2 = var1 + 1;
						}
						
						while (~var2 > ~dh.k) {
							ri.k[var2] = ri.k[1 + var2];
							ke.rb[var2] = ke.rb[var2 + 1];
							ii.G[var2] = ii.G[var2 - -1];
							eh.Y[var2] = eh.Y[var2 - -1];
							kg.o[var2] = kg.o[var2 + 1];
							++var2;
						}
						
						--var1;
						if (var10 == 0) {
							++var1;
							continue;
						}
					}
					
					eg var12 = ke.rb[var1];
					if (var12 == null) {
						var12 = eg.a(hi.cacheFile_4, ri.k[var1], 0);
						if (var12 == null) {
							if (var10 == 0) {
								++var1;
								continue;
							}
							
							eh.Y[var1] += var12.c();
							ke.rb[var1] = var12;
						} else {
							eh.Y[var1] += var12.c();
							ke.rb[var1] = var12;
						}
					}
					
					if (~eh.Y[var1] > -1) {
						int var3;
						oa var13;
						td var14;
						if (kg.o[var1] != 0) {
							int var4 = 128 * (kg.o[var1] & 255);
							int var5 = (16747784 & kg.o[var1]) >> 16;
							int var6 = 64 + (128 * var5 - le.T.coordX);
							int var7;
							int var8;
							if (~var6 > -1) {
								var6 = -var6;
								var7 = kg.o[var1] >> 8 & 255;
								var8 = -le.T.coordY + var7 * 128 + 64;
								if (~var8 > -1) {
									var8 = -var8;
								}
							} else {
								var7 = kg.o[var1] >> 8 & 255;
								var8 = -le.T.coordY + var7 * 128 + 64;
								if (~var8 > -1) {
									var8 = -var8;
								}
							}
							
							int var9 = -128 + (var6 - -var8);
							if (~var4 > ~var9) {
								eh.Y[var1] = -100;
								if (var10 != 0) {
									if (var9 < 0) {
										var9 = 0;
									}
									
									var3 = qf.L * (-var9 + var4) / var4;
									if (var10 != 0) {
										var3 = ci.z;
									}
									
									if (~var3 < -1) {
										var13 = var12.a().a(qi.o);
										var14 = td.a((oa) var13, 100, var3);
										var14.g(-1 + ii.G[var1]);
										ub.d.b(var14);
									}
									
									eh.Y[var1] = -100;
									++var1;
								} else {
									++var1;
								}
							} else {
								if (var9 < 0) {
									var9 = 0;
								}
								
								var3 = qf.L * (-var9 + var4) / var4;
								if (var10 != 0) {
									var3 = ci.z;
								}
								
								if (~var3 < -1) {
									var13 = var12.a().a(qi.o);
									var14 = td.a((oa) var13, 100, var3);
									var14.g(-1 + ii.G[var1]);
									ub.d.b(var14);
								}
								
								eh.Y[var1] = -100;
								++var1;
							}
						} else {
							var3 = ci.z;
							if (~var3 < -1) {
								var13 = var12.a().a(qi.o);
								var14 = td.a((oa) var13, 100, var3);
								var14.g(-1 + ii.G[var1]);
								ub.d.b(var14);
							}
							
							eh.Y[var1] = -100;
							++var1;
						}
					} else {
						++var1;
					}
				} while (dh.k > var1);
				
				label65:
				{
					if (li.aBoolean_q && !jc.k(15734)) {
						if (bc.mb != 0 && ~sc.g != 0) {
							ac.a(false, sc.g, true, q.cacheFile_6, 0, bc.mb);
						}
						
						li.aBoolean_q = false;
						if (var10 == 0) {
							break label65;
						}
					}
					
					if (bc.mb != 0 && ~sc.g != 0 && !jc.k(15734)) {
						++pg.T;
						af.P.p(136, 12885);
						af.P.writeInt(sc.g, (byte) -125);
						sc.g = -1;
					}
				}
				
				if (var0 <= 58) {
					a(false, (Object) null, false);
				}
			}
		} catch (RuntimeException var11) {
			throw bc.a(var11, "m.H(" + var0 + ')');
		}
	}
	
	final void a(byte var1, int var2, int var3) {
		try {
			int var5 = var3 * this.u >> 12;
			int var4 = var3 * this.t >> 12;
			++y;
			int var6 = var2 * this.v >> 12;
			if (var1 != 94) {
				w = null;
			}
			
			int var7 = var2 * this.s >> 12;
			kd.a(super.anInt_b, super.e, var5, var6, var7, var4, (byte) -58);
		} catch (RuntimeException var8) {
			throw bc.a(var8, "m.B(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	m(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		super(var5, var6, var7);
		
		try {
			this.u = var3;
			this.s = var4;
			this.v = var2;
			this.t = var1;
		} catch (RuntimeException var9) {
			throw bc.a(var9, "m.<init>(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ')');
		}
	}
	
	final void a(int var1, int var2, boolean var3) {
		try {
			++anInt_q;
			int var4 = this.t * var1 >> 12;
			int var5 = this.u * var1 >> 12;
			int var6 = var2 * this.v >> 12;
			if (!var3) {
				clanRequest = null;
			}
			
			int var7 = this.s * var2 >> 12;
			vf.b(super.anInt_m, var6, var7, var5, var4, 100);
		} catch (RuntimeException var8) {
			throw bc.a(var8, "m.A(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	static byte[] a(boolean var0, Object var1, boolean var2) {
		try {
			++n;
			if (var1 == null) {
				return null;
			} else if (var1 instanceof byte[]) {
				byte[] var5 = (byte[]) var1;
				return var2 ? bh.a(var5, 16086) : var5;
			} else if (var1 instanceof ee) {
				ee var3 = (ee) var1;
				return var3.a(127);
			} else if (var0) {
				return null;
			} else {
				throw new IllegalArgumentException();
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "m.I(" + var0 + ',' + "{...}" + ',' + var2 + ')');
		}
	}
	
	final void a(int var1, byte var2, int var3) {
		try {
			int var5 = this.u * var3 >> 12;
			int var4 = this.t * var3 >> 12;
			++A;
			if (var2 == 114) {
				int var6 = this.v * var1 >> 12;
				int var7 = this.s * var1 >> 12;
				nb.a(super.anInt_b, var2 ^ -13839, super.anInt_m, var7, var6, super.e, var5, var4);
			}
		} catch (RuntimeException var8) {
			throw bc.a(var8, "m.D(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	public static void b(int var0) {
		try {
			w = null;
			if (var0 > -74) {
				cacheFile6 = null;
			}
			
			clanRequest = null;
			z = null;
			x = null;
			cacheFile6 = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "m.J(" + var0 + ')');
		}
	}
}
