import java.util.Random;

final class jb extends af {
	
	static int R;
	static vc S;
	private int T = 2000;
	static ob V = rf.a(40, "rot:");
	static ob loadedTextures2;
	static int X;
	static int Y;
	private int Z = 0;
	static int ab;
	private static ob existingUser = rf.a(40, "Existing User");
	private static ob cb;
	static int db;
	private int eb = 16;
	static ob fb;
	private static ob loadedTextures = rf.a(40, "Loaded textures");
	static int hb;
	private int ib = 0;
	static ob existingUser2;
	static int kb;
	private int lb = 4096;
	static ob mb;
	private static ob nb;
	static ob ob;
	
	public jb() {
		super(0, true);
	}
	
	public static void i(int var0) {
		try {
			if (var0 != 25447) {
				i(-108);
			}
			
			V = null;
			existingUser2 = null;
			loadedTextures = null;
			cb = null;
			existingUser = null;
			nb = null;
			S = null;
			fb = null;
			ob = null;
			loadedTextures2 = null;
			mb = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "jb.A(" + var0 + ')');
		}
	}
	
	final void a(int var1, int var2, og var3) {
		int var5 = client.anInt_wb;
		
		try {
			label51:
			{
				label50:
				{
					label49:
					{
						label48:
						{
							label47:
							{
								if (var1 != 0) {
									if (~var1 == -2) {
										break label47;
									}
									
									if (var1 == 2) {
										break label48;
									}
									
									if (var1 == 3) {
										break label49;
									}
									
									if (~var1 != -5) {
										break label51;
									}
									
									if (var5 == 0) {
										break label50;
									}
								}
								
								this.ib = var3.readUnsignedByte(255);
								if (var5 == 0) {
									break label51;
								}
							}
							
							this.T = var3.readShort(92);
							if (var5 == 0) {
								break label51;
							}
						}
						
						this.eb = var3.readUnsignedByte(255);
						if (var5 == 0) {
							break label51;
						}
					}
					
					this.Z = var3.readShort(70);
					if (var5 == 0) {
						break label51;
					}
				}
				
				this.lb = var3.readShort(121);
			}
			
			++ab;
		} catch (RuntimeException var6) {
			throw bc.a(var6, "jb.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	final int[] a(byte var1, int var2) {
		int var27 = client.anInt_wb;
		
		try {
			++X;
			if (var1 < 13) {
				loadedTextures2 = null;
			}
			
			int[] var3 = super.nd_v.a(var2, 12);
			if (super.nd_v.n) {
				int var4 = this.lb >> 1;
				int[][] var5 = super.nd_v.a((int) 2);
				Random var6 = new Random((long) this.ib);
				int var7 = 0;
				if (var27 != 0 || this.T > var7) {
					do {
						int var8 = ~this.lb < -1 ? this.Z - var4 - -v.a((byte) 113, var6, this.lb) : this.Z;
						int var9 = v.a((byte) 95, var6, lh.eb);
						var8 = (var8 & 4083) >> 4;
						int var10 = v.a((byte) 125, var6, fi.q);
						int var12 = var10 + (this.eb * rc.f[var8] >> 12);
						int var11 = var9 + (nf.Y[var8] * this.eb >> 12);
						int var14 = var11 + -var9;
						int var13 = -var10 + var12;
						if (~var14 == -1) {
							if (var13 == 0) {
								++var7;
								continue;
							}
							
							if (~var13 > -1) {
								var13 = -var13;
							}
						} else if (~var13 > -1) {
							var13 = -var13;
						}
						
						if (var14 < 0) {
							var14 = -var14;
						}
						
						boolean var15 = ~var14 > ~var13;
						int var16;
						int var17;
						if (var15) {
							var17 = var11;
							var16 = var9;
							var11 = var12;
							var9 = var10;
							var12 = var17;
							var10 = var16;
						}
						
						if (~var11 > ~var9) {
							var16 = var9;
							var9 = var11;
							var17 = var10;
							var11 = var16;
							var10 = var12;
							var12 = var17;
						}
						
						var16 = var10;
						var17 = var11 - var9;
						int var18 = var12 + -var10;
						int var20 = 2048 / var17;
						int var19 = -var17 / 2;
						int var10000;
						if (~var18 > -1) {
							var18 = -var18;
							var10000 = var12 > var10 ? 1 : -1;
						} else {
							var10000 = var12 > var10 ? 1 : -1;
						}
						
						int var22 = var10000;
						int var21 = 1024 - (v.a((byte) 118, var6, 4096) >> -249216254);
						int var23 = var9;
						if (var27 == 0 && ~var9 <= ~var11) {
							++var7;
						} else {
							do {
								var19 += var18;
								int var24 = var21 - -1024 - -(var20 * (-var9 + var23));
								int var25 = var23 & kg.b;
								int var26 = fc.jb & var16;
								if (~var19 < -1) {
									var16 += var22;
									var19 += -var17;
								}
								
								if (var15) {
									var5[var26][var25] = var24;
									if (var27 != 0) {
										var5[var25][var26] = var24;
										++var23;
									} else {
										++var23;
									}
								} else {
									var5[var25][var26] = var24;
									++var23;
								}
							} while (~var23 > ~var11);
							
							++var7;
						}
					} while (this.T > var7);
				}
			}
			
			return var3;
		} catch (RuntimeException var28) {
			throw bc.a(var28, "jb.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	static void a(byte unused, pe cacheFile2) {
		try {
			++kb;
			md.cacheFile2 = cacheFile2;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "jb.D(" + unused + ',' + (cacheFile2 != null ? "{...}" : "null") + ')');
		}
	}
	
	final void f(int var1) {
		try {
			++R;
			fc.f(var1);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "jb.L(" + var1 + ')');
		}
	}
	
	static void b(boolean var0) {
		try {
			ch.Z = false;
			if (!var0) {
				existingUser = null;
			}
			
			++Y;
			ag.forceSend = false;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "jb.E(" + var0 + ')');
		}
	}
	
	static int a(byte var0, int var1, int var2, int var3) {
		try {
			++hb;
			var2 &= 3;
			if (var2 == 0) {
				return var1;
			} else {
				if (var0 <= 28) {
					existingUser2 = null;
				}
				
				return ~var2 == -2 ? var3 : (~var2 == -3 ? -var1 + 7 : -var3 + 7);
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "jb.C(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	
	static {
		loadedTextures2 = loadedTextures;
		cb = rf.a(40, "Try again in 60 secs)3)3)3");
		fb = cb;
		existingUser2 = existingUser;
		S = new vc(128);
		mb = rf.a(40, "Verbindung konnte nicht hergestellt werden)3");
		nb = rf.a(40, "Error connecting to server)3");
		ob = nb;
	}
}
