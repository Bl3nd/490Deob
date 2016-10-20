final class s extends af {
	
	static ob R = null;
	static int S;
	static ob T = rf.a(40, "Fps:");
	static ob U = rf.a(40, "Nehmen");
	static ob V = rf.a(40, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");
	private dc[] W;
	static int X;
	static int Y;
	static int Z;
	static int ab;
	static double bb = -1.0D;
	static int cb;
	static int[] db = new int[5];
	static int eb;
	
	public static void i(int var0) {
		try {
			T = null;
			db = null;
			V = null;
			U = null;
			R = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "s.C(" + var0 + ')');
		}
	}
	
	private void a(int var1, int[][] var2) {
		int var9 = client.anInt_wb;
		
		try {
			++Z;
			int var4 = fi.q;
			int var3 = lh.eb;
			de.a(var2, -26);
			qb.a(kg.b, var1, 0, (byte) 55, fc.jb);
			if (this.W != null) {
				int var5 = 0;
				if (var9 != 0 || ~this.W.length < ~var5) {
					do {
						dc var6 = this.W[var5];
						int var8 = var6.e;
						int var7 = var6.anInt_m;
						if (var7 < 0) {
							if (~var8 <= -1) {
								var6.a((byte) 94, (int) var4, var3);
								if (var9 != 0) {
									if (~var8 > -1) {
										var6.a(var3, var4, true);
										if (var9 != 0) {
											var6.a((int) var4, (byte) 114, var3);
											++var5;
										} else {
											++var5;
										}
									} else {
										var6.a((int) var4, (byte) 114, var3);
										++var5;
									}
								} else {
									++var5;
								}
							} else {
								++var5;
							}
						} else if (~var8 > -1) {
							var6.a(var3, var4, true);
							if (var9 != 0) {
								var6.a((int) var4, (byte) 114, var3);
								++var5;
							} else {
								++var5;
							}
						} else {
							var6.a((int) var4, (byte) 114, var3);
							++var5;
						}
					} while (~this.W.length < ~var5);
					
				}
			}
		} catch (RuntimeException var10) {
			throw bc.a(var10, "s.A(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}
	
	static boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) {
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) {
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) {
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) {
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
			int var9 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
			int var10 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
			return var8 * var10 > 0 && var10 * var9 > 0;
		}
	}
	
	final int[] a(byte var1, int var2) {
		try {
			int[] var3 = super.nd_v.a(var2, 12);
			++eb;
			if (var1 < 13) {
				return null;
			} else {
				if (super.nd_v.n) {
					this.a(0, super.nd_v.a((int) 2));
				}
				
				return var3;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "s.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	final void a(int var1, int var2, og var3) {
		int var8 = client.anInt_wb;
		
		try {
			label91:
			{
				if (var1 == 0) {
					this.W = new dc[var3.readUnsignedByte(255)];
					int var5 = 0;
					if (var8 != 0 || this.W.length > var5) {
						do {
							label84:
							{
								int var6 = var3.readUnsignedByte(255);
								if (var6 != 0) {
									if (~var6 == -2) {
										break label84;
									}
									
									if (~var6 == -3) {
										this.W[var5] = la.a((byte) 117, var3);
										if (var8 != 0) {
											this.W[var5] = n.a((og) var3, 86);
											++var5;
										} else {
											++var5;
										}
										continue;
									}
									
									if (~var6 != -4) {
										++var5;
										continue;
									}
									
									if (var8 == 0) {
										this.W[var5] = n.a((og) var3, 86);
										++var5;
										continue;
									}
								}
								
								this.W[var5] = cd.a(108, var3);
								if (var8 == 0) {
									++var5;
									continue;
								}
							}
							
							this.W[var5] = ea.a((og) var3, (int) 0);
							if (var8 != 0) {
								this.W[var5] = la.a((byte) 117, var3);
								if (var8 != 0) {
									this.W[var5] = n.a((og) var3, 86);
									++var5;
								} else {
									++var5;
								}
							} else {
								++var5;
							}
						} while (this.W.length > var5);
					}
					
					if (var8 == 0) {
						break label91;
					}
				}
				
				if (~var1 == -2) {
					super.u = var3.readUnsignedByte(255) == 1;
				}
			}
			
			++ab;
		} catch (RuntimeException var9) {
			throw bc.a(var9, "s.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	static ob a(og var0, boolean var1) {
		try {
			++cb;
			if (!var1) {
				a(-76, -41, 62, -73, 18, -71, -88, -110);
			}
			
			return lh.a((byte) 66, var0, 32767);
		} catch (RuntimeException var3) {
			throw bc.a(var3, "s.E(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}
	
	final int[][] b(int var1, byte var2) {
		int var17 = client.anInt_wb;
		
		try {
			++S;
			int[][] var4 = super.ve_s.a(var1, (byte) 45);
			if (super.ve_s.u) {
				int var6 = fi.q;
				int var5 = lh.eb;
				int[][][] var8 = super.ve_s.a((int) 9924);
				int[][] var7 = new int[var6][var5];
				this.a(0, var7);
				int var9 = 0;
				if (var17 != 0 || var9 < fi.q) {
					do {
						int[] var10 = var7[var9];
						int[][] var11 = var8[var9];
						int[] var12 = var11[0];
						int[] var13 = var11[1];
						int[] var14 = var11[2];
						int var15 = 0;
						if (var17 != 0 || ~var15 > ~lh.eb) {
							do {
								int var16 = var10[var15];
								var14[var15] = bd.b(4080, (int) (var16 << 4));
								var13[var15] = bd.b('\uff00', (int) var16) >> 4;
								var12[var15] = bd.b(var16, 16711680) >> 12;
								++var15;
							} while (~var15 > ~lh.eb);
						}
						
						++var9;
					} while (var9 < fi.q);
				}
			}
			
			return var4;
		} catch (RuntimeException var18) {
			throw bc.a(var18, "s.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	public s() {
		super(0, true);
	}
}
