final class id extends vd {
	
	static int o;
	static boolean p;
	static ob loadingTitleScreen2;
	static ob r;
	static int s = 0;
	private static ob loadingTitleScreen = rf.a(40, "Loading title screen )2 ");
	static ob u = rf.a(40, "Lade)3)3)3");
	private static ob v;
	static int w;
	static ob x;
	private int[] y;
	static int[] z;
	byte[] A;
	private static ob B;
	static int C;
	int D;
	static ob E;
	short[] F;
	oa[] G;
	fi[] H;
	byte[] I;
	byte[] J;
	
	final void d(int var1) {
		try {
			if (var1 != 11071) {
				this.A = null;
			}
			
			this.y = null;
			++C;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "id.B(" + var1 + ')');
		}
	}
	
	public static void a(byte var0) {
		try {
			z = null;
			E = null;
			if (var0 > -47) {
				loadingTitleScreen2 = null;
			}
			
			x = null;
			loadingTitleScreen = null;
			loadingTitleScreen2 = null;
			r = null;
			B = null;
			v = null;
			u = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "id.A(" + var0 + ')');
		}
	}
	
	final boolean a(byte[] var1, int var2, oe var3, int[] var4) {
		
		try {
			++o;
			boolean var5 = true;
			int var6 = 0;
			oa var7 = null;
			int var8 = 0;
			
			for (int var9 = 66 % ((15 - var2) / 39); var8 < 128; ++var8) {
				if (var1 == null || ~var1[var8] != -1) {
					int var10 = this.y[var8];
					if (~var10 != -1) {
						if (~var10 != ~var6) {
							var6 = var10--;
							if (~(var10 & 1) == -1) {
								var7 = var3.b(var4, (byte) -105, var10 >> 2);
							} else {
								var7 = var3.a(var4, (byte) -73, var10 >> 2);
							}
							
							if (var7 == null) {
								var5 = false;
							}
						}
						
						if (var7 != null) {
							this.G[var8] = var7;
							this.y[var8] = 0;
						}
					}
				}
			}
			
			return var5;
		} catch (RuntimeException var12) {
			throw bc.a(var12, "id.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ',' + (var4 != null ? "{...}" : "null") + ')');
		}
	}
	
	@SuppressWarnings("ConstantConditions")
	static void a(og paramog, int paramInt1, int paramInt2, t paramt) {
		try {
			wa localwa = new wa();
			w += 1;
			localwa.q = paramog.readUnsignedByte(255);
			localwa.z = paramog.readInt(1029109968);
			localwa.o = new int[localwa.q];
			localwa.y = new int[localwa.q];
			localwa.x = new int[localwa.q];
			localwa.r = new byte[localwa.q][][];
			localwa.u = new fd[localwa.q];
			localwa.B = new fd[localwa.q];
			int i = 0;
			while ((~localwa.q) < (~i)) {
				try {
					int j = paramog.readUnsignedByte(255);
					String str1;
					String str2;
					int k;
					if ((j != 0) && (j != 1) && (j != 2)) {
						if ((j == 3) || (j == 4)) {
							str1 = new String(paramog.t(-19405).getBytes(-35));
							str2 = new String(paramog.t(-19405).getBytes(-35));
							k = paramog.readUnsignedByte(255);
							String[] arrayOfString = new String[k];
							int m = 0;
							while ((~k) < (~m)) {
								arrayOfString[m] = new String(paramog.t(-19405).getBytes(-35));
								m++;
							}
							byte[][] arrayOfByte = new byte[k][];
							if ((~j) == -4) {
								int n = 0;
								while (k > n) {
									int i1 = paramog.readInt(1029109968);
									arrayOfByte[n] = new byte[i1];
									paramog.readBytes(i1, 0, 106, arrayOfByte[n]);
									n++;
								}
							}
							Class[] arrayOfClass = new Class[k];
							localwa.x[i] = j;
							int i1 = 0;
							while ((~i1) > (~k)) {
								arrayOfClass[i1] = da.a(arrayOfString[i1], 0);
								i1++;
							}
							localwa.B[i] = paramt.a((byte) -117, str2, da.a(str1, 0), arrayOfClass);
							localwa.r[i] = arrayOfByte;
						}
					} else {
						str1 = new String(paramog.t(-19405).getBytes(-35));
						str2 = new String(paramog.t(-19405).getBytes(-35));
						k = 0;
						if ((~j) == -2) {
							k = paramog.readInt(1029109968);
						}
						localwa.x[i] = j;
						localwa.o[i] = k;
						localwa.u[i] = paramt.a(str2, da.a(str1, ph.a(paramInt2, 6358)), false);
					}
				} catch (ClassNotFoundException localClassNotFoundException) {
					localwa.y[i] = -1;
				} catch (SecurityException localSecurityException) {
					localwa.y[i] = -2;
				} catch (NullPointerException localNullPointerException) {
					localwa.y[i] = -3;
				} catch (Exception localException) {
					localwa.y[i] = -4;
				} catch (Throwable localThrowable) {
					localwa.y[i] = -5;
				}
				i++;
			}
			eh.T.a(0, localwa);
		} catch (RuntimeException localRuntimeException) {
			throw bc.a(localRuntimeException, "id.C(" + (paramog != null ? "{...}" : "null") + ',' + paramInt1 + ',' + paramInt2 + ',' + (paramt != null ? "{...}" : "null") + ')');
		}
		
	}
	
	public id() {
	}
	
	id(byte[] var1) {
		super();
		int var53 = client.anInt_wb;
		
		try {
			this.y = new int[128];
			this.A = new byte[128];
			this.H = new fi[128];
			this.G = new oa[128];
			int var3 = 0;
			this.J = new byte[128];
			this.F = new short[128];
			this.I = new byte[128];
			og var2 = new og(var1);
			if (var53 != 0) {
				++var3;
			}
			
			while (var2.buffer[var3 + var2.pointer] != 0) {
				++var3;
			}
			
			byte[] var4 = new byte[var3];
			int var5 = 0;
			if (var53 != 0) {
				var4[var5] = var2.readByte(1064893128);
				++var5;
			}
			
			while (var5 < var3) {
				var4[var5] = var2.readByte(1064893128);
				++var5;
			}
			
			++var2.pointer;
			int var7 = 0;
			++var3;
			int var6 = var2.pointer;
			var2.pointer += var3;
			if (var53 != 0) {
				++var7;
			}
			
			while (var2.buffer[var7 + var2.pointer] != 0) {
				++var7;
			}
			
			byte[] var8 = new byte[var7];
			int var9 = 0;
			if (var53 != 0) {
				var8[var9] = var2.readByte(1064893128);
				++var9;
			}
			
			while (var9 < var7) {
				var8[var9] = var2.readByte(1064893128);
				++var9;
			}
			
			++var7;
			++var2.pointer;
			int var10 = var2.pointer;
			var2.pointer += var7;
			int var11 = 0;
			if (var53 != 0) {
				++var11;
			}
			
			while (~var2.buffer[var11 + var2.pointer] != -1) {
				++var11;
			}
			
			byte[] var12 = new byte[var11];
			int var13 = 0;
			if (var53 != 0) {
				var12[var13] = var2.readByte(1064893128);
				++var13;
			}
			
			while (~var13 > ~var11) {
				var12[var13] = var2.readByte(1064893128);
				++var13;
			}
			
			byte[] var14;
			int var15;
			int var17;
			int var18;
			label1779:
			{
				++var11;
				++var2.pointer;
				var14 = new byte[var11];
				if (~var11 >= -2) {
					var15 = var11;
					if (var53 == 0) {
						break label1779;
					}
				}
				
				var15 = 2;
				var14[1] = 1;
				int var16 = 1;
				var17 = 2;
				if (var53 != 0 || ~var11 < ~var17) {
					do {
						var18 = var2.readUnsignedByte(255);
						if (var18 != 0) {
							if (var16 >= var18) {
								--var18;
							}
							
							var16 = var18;
							if (var53 != 0) {
								var16 = var15++;
							}
						} else {
							var16 = var15++;
						}
						
						var14[var17] = (byte) var16;
						++var17;
					} while (~var11 < ~var17);
				}
			}
			
			fi[] var55 = new fi[var15];
			var17 = 0;
			int var19;
			fi var56;
			if (var53 != 0) {
				var56 = var55[var17] = new fi();
				var19 = var2.readUnsignedByte(255);
				if (~var19 < -1) {
					var56.x = new byte[2 * var19];
				}
				
				var19 = var2.readUnsignedByte(255);
				if (~var19 < -1) {
					var56.y = new byte[var19 * 2 - -2];
					var56.y[1] = 64;
				}
				
				++var17;
			}
			
			for (; var55.length > var17; ++var17) {
				var56 = var55[var17] = new fi();
				var19 = var2.readUnsignedByte(255);
				if (~var19 < -1) {
					var56.x = new byte[2 * var19];
				}
				
				var19 = var2.readUnsignedByte(255);
				if (~var19 < -1) {
					var56.y = new byte[var19 * 2 - -2];
					var56.y[1] = 64;
				}
			}
			
			var18 = var2.readUnsignedByte(255);
			int var21 = 0;
			byte[] var57 = var18 <= 0 ? null : new byte[2 * var18];
			var18 = var2.readUnsignedByte(255);
			if (var53 != 0) {
				++var21;
			}
			
			while (var2.buffer[var21 + var2.pointer] != 0) {
				++var21;
			}
			
			byte[] var22 = new byte[var21];
			int var23 = 0;
			if (var53 != 0) {
				var22[var23] = var2.readByte(1064893128);
				++var23;
			}
			
			while (~var23 > ~var21) {
				var22[var23] = var2.readByte(1064893128);
				++var23;
			}
			
			byte[] var20 = ~var18 >= -1 ? null : new byte[var18 * 2];
			++var2.pointer;
			++var21;
			int var24 = 0;
			int var25 = 0;
			if (var53 != 0) {
				var24 += var2.readUnsignedByte(255);
				this.F[var25] = (short) var24;
				++var25;
			}
			
			while (~var25 > -129) {
				var24 += var2.readUnsignedByte(255);
				this.F[var25] = (short) var24;
				++var25;
			}
			
			var24 = 0;
			int var26 = 0;
			if (var53 != 0 || var26 < 128) {
				do {
					var24 += var2.readUnsignedByte(255);
					this.F[var26] = (short) (this.F[var26] + (var24 << 8));
					++var26;
				} while (var26 < 128);
			}
			
			int var27 = 0;
			int var28 = 0;
			int var29 = 0;
			int var30 = 0;
			if (var53 != 0) {
				if (var27 == 0) {
					if (~var28 <= ~var22.length) {
						var27 = -1;
						if (var53 != 0) {
							var27 = var22[var28++];
							var29 = var2.a(false);
						} else {
							var29 = var2.a(false);
						}
					} else {
						var27 = var22[var28++];
						var29 = var2.a(false);
					}
				}
				
				this.F[var30] = (short) (this.F[var30] + (bd.b(-1 + var29, (int) 2) << 14));
				this.y[var30] = var29;
				--var27;
				++var30;
			}
			
			while (~var30 > -129) {
				if (var27 == 0) {
					if (~var28 <= ~var22.length) {
						var27 = -1;
						if (var53 != 0) {
							var27 = var22[var28++];
							var29 = var2.a(false);
						} else {
							var29 = var2.a(false);
						}
					} else {
						var27 = var22[var28++];
						var29 = var2.a(false);
					}
				}
				
				this.F[var30] = (short) (this.F[var30] + (bd.b(-1 + var29, (int) 2) << 14));
				this.y[var30] = var29;
				--var27;
				++var30;
			}
			
			var28 = 0;
			var27 = 0;
			int var31 = 0;
			int var32 = 0;
			if (var53 != 0 || ~var32 > -129) {
				do {
					if (~this.y[var32] != -1) {
						if (~var27 == -1) {
							if (var28 >= var4.length) {
								var27 = -1;
								if (var53 != 0) {
									var27 = var4[var28++];
								}
							} else {
								var27 = var4[var28++];
							}
							
							var31 = var2.buffer[var6++] - 1;
						}
						
						this.A[var32] = (byte) var31;
						--var27;
						++var32;
					} else {
						++var32;
					}
				} while (~var32 > -129);
			}
			
			var28 = 0;
			int var33 = 0;
			var27 = 0;
			int var34 = 0;
			if (var53 != 0) {
				if (this.y[var34] != 0) {
					if (~var27 == -1) {
						if (~var28 > ~var8.length) {
							var27 = var8[var28++];
							if (var53 != 0) {
								var27 = -1;
							}
						} else {
							var27 = -1;
						}
						
						var33 = var2.buffer[var10++] - -16 << 2;
					}
					
					--var27;
					this.J[var34] = (byte) var33;
					++var34;
				} else {
					++var34;
				}
			}
			
			while (~var34 > -129) {
				if (this.y[var34] != 0) {
					if (~var27 == -1) {
						if (~var28 > ~var8.length) {
							var27 = var8[var28++];
							if (var53 != 0) {
								var27 = -1;
							}
						} else {
							var27 = -1;
						}
						
						var33 = var2.buffer[var10++] - -16 << 2;
					}
					
					--var27;
					this.J[var34] = (byte) var33;
					++var34;
				} else {
					++var34;
				}
			}
			
			var27 = 0;
			fi var35 = null;
			var28 = 0;
			
			for (int var36 = 0; var36 < 128; ++var36) {
				if (this.y[var36] != 0) {
					if (var27 == 0) {
						label1523:
						{
							var35 = var55[var14[var28]];
							if (var28 < var12.length) {
								var27 = var12[var28++];
								if (var53 == 0) {
									break label1523;
								}
							}
							
							var27 = -1;
						}
					}
					
					this.H[var36] = var35;
					--var27;
				}
			}
			
			var28 = 0;
			var27 = 0;
			int var37 = 0;
			int var38 = 0;
			if (var53 != 0 || var38 < 128) {
				do {
					if (~var27 == -1) {
						if (~var28 > ~var22.length) {
							var27 = var22[var28++];
							if (var53 != 0) {
								var27 = -1;
							}
						} else {
							var27 = -1;
						}
						
						if (~this.y[var38] < -1) {
							var37 = var2.readUnsignedByte(255) - -1;
						}
					}
					
					this.I[var38] = (byte) var37;
					--var27;
					++var38;
				} while (var38 < 128);
			}
			
			this.D = 1 + var2.readUnsignedByte(255);
			int var39 = 0;
			int var41;
			int var42;
			int var43;
			byte var44;
			int var45;
			int var46;
			byte var47;
			byte var48;
			int var49;
			int var50;
			int var51;
			int var52;
			Object var58;
			Object var59;
			int var60;
			fi var61;
			fi var62;
			byte var63;
			int var64;
			fi var65;
			int var66;
			int var67;
			fi var68;
			fi var69;
			if (var53 == 0 && ~var39 <= ~var15) {
				if (var57 != null) {
					var60 = 1;
					if (var53 != 0 || var57.length > var60) {
						do {
							var57[var60] = var2.readByte(1064893128);
							var60 += 2;
						} while (var57.length > var60);
					}
				}
				
				if (var20 != null) {
					var60 = 1;
					if (var53 != 0) {
						var20[var60] = var2.readByte(1064893128);
						var60 += 2;
					}
					
					while (~var60 > ~var20.length) {
						var20[var60] = var2.readByte(1064893128);
						var60 += 2;
					}
				}
				
				var60 = 0;
				if (var53 != 0 || var15 > var60) {
					do {
						var62 = var55[var60];
						if (var62.y == null) {
							++var60;
						} else {
							var24 = 0;
							var42 = 2;
							if (var53 == 0 && ~var62.y.length >= ~var42) {
								++var60;
							} else {
								do {
									var24 = var2.readUnsignedByte(255) + 1 + var24;
									var62.y[var42] = (byte) var24;
									var42 += 2;
								} while (~var62.y.length < ~var42);
								
								++var60;
							}
						}
					} while (var15 > var60);
				}
				
				var41 = 0;
				if (var53 == 0 && var41 >= var15) {
					if (var57 != null) {
						var24 = var2.readUnsignedByte(255);
						var57[0] = (byte) var24;
						var42 = 2;
						if (var53 != 0 || var57.length > var42) {
							do {
								var24 = 1 + (var24 - -var2.readUnsignedByte(255));
								var57[var42] = (byte) var24;
								var42 += 2;
							} while (var57.length > var42);
						}
						
						var63 = var57[0];
						var44 = var57[1];
						var45 = 0;
						if (var53 != 0 || var63 > var45) {
							do {
								this.I[var45] = (byte) (32 + this.I[var45] * var44 >> 6);
								++var45;
							} while (var63 > var45);
						}
						
						var46 = 2;
						if (var53 != 0 || var46 < var57.length) {
							do {
								var48 = var57[1 + var46];
								var47 = var57[var46];
								var49 = var44 * (var47 + -var63) + (-var63 + var47) / 2;
								var50 = var63;
								if (var53 != 0 || ~var63 > ~var47) {
									do {
										var51 = jd.a(-var63 + var47, -30453, var49);
										var49 += -var44 + var48;
										this.I[var50] = (byte) (var51 * this.I[var50] + 32 >> 6);
										++var50;
									} while (~var50 > ~var47);
								}
								
								var46 += 2;
								var63 = var47;
								var44 = var48;
							} while (var46 < var57.length);
						}
						
						var59 = null;
						var66 = var63;
						if (var53 != 0 || ~var63 > -129) {
							do {
								this.I[var66] = (byte) (this.I[var66] * var44 + 32 >> 6);
								++var66;
							} while (~var66 > -129);
						}
					}
					
					if (var20 != null) {
						var24 = var2.readUnsignedByte(255);
						var20[0] = (byte) var24;
						var42 = 2;
						if (var53 != 0 || var20.length > var42) {
							do {
								var24 += var2.readUnsignedByte(255) + 1;
								var20[var42] = (byte) var24;
								var42 += 2;
							} while (var20.length > var42);
						}
						
						var63 = var20[0];
						var64 = var20[1] << 1;
						var45 = 0;
						if (var53 != 0 || var63 > var45) {
							do {
								var46 = (this.J[var45] & 255) - -var64;
								if (var46 < 0) {
									var46 = 0;
								}
								
								if (var46 > 128) {
									var46 = 128;
								}
								
								this.J[var45] = (byte) var46;
								++var45;
							} while (var63 > var45);
						}
						
						var46 = 2;
						if (var53 != 0 || var20.length > var46) {
							do {
								var67 = var20[var46 + 1] << 1;
								var47 = var20[var46];
								var49 = (var47 - var63) / 2 + (-var63 + var47) * var64;
								var50 = var63;
								if (var53 != 0 || var63 < var47) {
									do {
										var51 = jd.a(-var63 + var47, -30453, var49);
										var52 = var51 + (this.J[var50] & 255);
										var49 += var67 + -var64;
										if (var52 < 0) {
											var52 = 0;
										}
										
										if (var52 > 128) {
											var52 = 128;
										}
										
										this.J[var50] = (byte) var52;
										++var50;
									} while (var50 < var47);
								}
								
								var64 = var67;
								var63 = var47;
								var46 += 2;
							} while (var20.length > var46);
						}
						
						var58 = null;
						var66 = var63;
						if (var53 != 0 || var63 < 128) {
							do {
								var67 = var64 + (255 & this.J[var66]);
								if (var67 < 0) {
									var67 = 0;
								}
								
								if (var67 > 128) {
									var67 = 128;
								}
								
								this.J[var66] = (byte) var67;
								++var66;
							} while (var66 < 128);
						}
					}
					
					var42 = 0;
					if (var53 != 0) {
						var55[var42].c = var2.readUnsignedByte(255);
						++var42;
					}
					
					while (var42 < var15) {
						var55[var42].c = var2.readUnsignedByte(255);
						++var42;
					}
					
					var43 = 0;
					if (var53 != 0 || ~var43 > ~var15) {
						do {
							var65 = var55[var43];
							if (var65.x != null) {
								var65.z = var2.readUnsignedByte(255);
							}
							
							if (var65.y != null) {
								var65.e = var2.readUnsignedByte(255);
							}
							
							if (var65.c > 0) {
								var65.h = var2.readUnsignedByte(255);
							}
							
							++var43;
						} while (~var43 > ~var15);
					}
					
					var64 = 0;
					if (var53 != 0) {
						var55[var64].o = var2.readUnsignedByte(255);
						++var64;
					}
					
					while (~var64 > ~var15) {
						var55[var64].o = var2.readUnsignedByte(255);
						++var64;
					}
					
					var45 = 0;
					if (var53 != 0 || ~var15 < ~var45) {
						do {
							var68 = var55[var45];
							if (var68.o > 0) {
								var68.j = var2.readUnsignedByte(255);
							}
							
							++var45;
						} while (~var15 < ~var45);
					}
					
					var46 = 0;
					if (var53 != 0 || ~var46 > ~var15) {
						do {
							var69 = var55[var46];
							if (var69.j > 0) {
								var69.k = var2.readUnsignedByte(255);
							}
							
							++var46;
						} while (~var46 > ~var15);
						
					}
				} else {
					do {
						var61 = var55[var41];
						if (var61.x == null) {
							++var41;
						} else {
							var24 = 0;
							var43 = 2;
							if (var53 != 0) {
								var24 = var2.readUnsignedByte(255) + 1 + var24;
								var61.x[var43] = (byte) var24;
								var43 += 2;
							}
							
							while (~var61.x.length < ~var43) {
								var24 = var2.readUnsignedByte(255) + 1 + var24;
								var61.x[var43] = (byte) var24;
								var43 += 2;
							}
							
							++var41;
						}
					} while (var41 < var15);
					
					if (var57 != null) {
						var24 = var2.readUnsignedByte(255);
						var57[0] = (byte) var24;
						var42 = 2;
						if (var53 != 0 || var57.length > var42) {
							do {
								var24 = 1 + (var24 - -var2.readUnsignedByte(255));
								var57[var42] = (byte) var24;
								var42 += 2;
							} while (var57.length > var42);
						}
						
						var63 = var57[0];
						var44 = var57[1];
						var45 = 0;
						if (var53 != 0 || var63 > var45) {
							do {
								this.I[var45] = (byte) (32 + this.I[var45] * var44 >> 6);
								++var45;
							} while (var63 > var45);
						}
						
						var46 = 2;
						if (var53 != 0 || var46 < var57.length) {
							do {
								var48 = var57[1 + var46];
								var47 = var57[var46];
								var49 = var44 * (var47 + -var63) + (-var63 + var47) / 2;
								var50 = var63;
								if (var53 != 0 || ~var63 > ~var47) {
									do {
										var51 = jd.a(-var63 + var47, -30453, var49);
										var49 += -var44 + var48;
										this.I[var50] = (byte) (var51 * this.I[var50] + 32 >> 6);
										++var50;
									} while (~var50 > ~var47);
								}
								
								var46 += 2;
								var63 = var47;
								var44 = var48;
							} while (var46 < var57.length);
						}
						
						var59 = null;
						var66 = var63;
						if (var53 != 0 || ~var63 > -129) {
							do {
								this.I[var66] = (byte) (this.I[var66] * var44 + 32 >> 6);
								++var66;
							} while (~var66 > -129);
						}
					}
					
					if (var20 != null) {
						var24 = var2.readUnsignedByte(255);
						var20[0] = (byte) var24;
						var42 = 2;
						if (var53 != 0 || var20.length > var42) {
							do {
								var24 += var2.readUnsignedByte(255) + 1;
								var20[var42] = (byte) var24;
								var42 += 2;
							} while (var20.length > var42);
						}
						
						var63 = var20[0];
						var64 = var20[1] << 1;
						var45 = 0;
						if (var53 != 0 || var63 > var45) {
							do {
								var46 = (this.J[var45] & 255) - -var64;
								if (var46 < 0) {
									var46 = 0;
								}
								
								if (var46 > 128) {
									var46 = 128;
								}
								
								this.J[var45] = (byte) var46;
								++var45;
							} while (var63 > var45);
						}
						
						var46 = 2;
						if (var53 != 0 || var20.length > var46) {
							do {
								var67 = var20[var46 + 1] << 1;
								var47 = var20[var46];
								var49 = (var47 - var63) / 2 + (-var63 + var47) * var64;
								var50 = var63;
								if (var53 != 0 || var63 < var47) {
									do {
										var51 = jd.a(-var63 + var47, -30453, var49);
										var52 = var51 + (this.J[var50] & 255);
										var49 += var67 + -var64;
										if (var52 < 0) {
											var52 = 0;
										}
										
										if (var52 > 128) {
											var52 = 128;
										}
										
										this.J[var50] = (byte) var52;
										++var50;
									} while (var50 < var47);
								}
								
								var64 = var67;
								var63 = var47;
								var46 += 2;
							} while (var20.length > var46);
						}
						
						var58 = null;
						var66 = var63;
						if (var53 != 0 || var63 < 128) {
							do {
								var67 = var64 + (255 & this.J[var66]);
								if (var67 < 0) {
									var67 = 0;
								}
								
								if (var67 > 128) {
									var67 = 128;
								}
								
								this.J[var66] = (byte) var67;
								++var66;
							} while (var66 < 128);
						}
					}
					
					var42 = 0;
					if (var53 != 0) {
						var55[var42].c = var2.readUnsignedByte(255);
						++var42;
					}
					
					while (var42 < var15) {
						var55[var42].c = var2.readUnsignedByte(255);
						++var42;
					}
					
					var43 = 0;
					if (var53 != 0 || ~var43 > ~var15) {
						do {
							var65 = var55[var43];
							if (var65.x != null) {
								var65.z = var2.readUnsignedByte(255);
							}
							
							if (var65.y != null) {
								var65.e = var2.readUnsignedByte(255);
							}
							
							if (var65.c > 0) {
								var65.h = var2.readUnsignedByte(255);
							}
							
							++var43;
						} while (~var43 > ~var15);
					}
					
					var64 = 0;
					if (var53 != 0) {
						var55[var64].o = var2.readUnsignedByte(255);
						++var64;
					}
					
					while (~var64 > ~var15) {
						var55[var64].o = var2.readUnsignedByte(255);
						++var64;
					}
					
					var45 = 0;
					if (var53 != 0 || ~var15 < ~var45) {
						do {
							var68 = var55[var45];
							if (var68.o > 0) {
								var68.j = var2.readUnsignedByte(255);
							}
							
							++var45;
						} while (~var15 < ~var45);
					}
					
					var46 = 0;
					if (var53 != 0 || ~var46 > ~var15) {
						do {
							var69 = var55[var46];
							if (var69.j > 0) {
								var69.k = var2.readUnsignedByte(255);
							}
							
							++var46;
						} while (~var46 > ~var15);
						
					}
				}
			} else {
				do {
					fi var40 = var55[var39];
					if (var40.x != null) {
						var41 = 1;
						if (var53 != 0) {
							var40.x[var41] = var2.readByte(1064893128);
							var41 += 2;
						}
						
						while (var40.x.length > var41) {
							var40.x[var41] = var2.readByte(1064893128);
							var41 += 2;
						}
					}
					
					if (var40.y == null) {
						++var39;
					} else {
						var41 = 3;
						if (var53 != 0) {
							var40.y[var41] = var2.readByte(1064893128);
							var41 += 2;
						}
						
						while (~var41 > ~(var40.y.length + -2)) {
							var40.y[var41] = var2.readByte(1064893128);
							var41 += 2;
						}
						
						++var39;
					}
				} while (~var39 > ~var15);
				
				if (var57 != null) {
					var60 = 1;
					if (var53 != 0 || var57.length > var60) {
						do {
							var57[var60] = var2.readByte(1064893128);
							var60 += 2;
						} while (var57.length > var60);
					}
				}
				
				if (var20 != null) {
					var60 = 1;
					if (var53 != 0) {
						var20[var60] = var2.readByte(1064893128);
						var60 += 2;
					}
					
					while (~var60 > ~var20.length) {
						var20[var60] = var2.readByte(1064893128);
						var60 += 2;
					}
				}
				
				var60 = 0;
				if (var53 != 0 || var15 > var60) {
					do {
						var62 = var55[var60];
						if (var62.y == null) {
							++var60;
						} else {
							var24 = 0;
							var42 = 2;
							if (var53 == 0 && ~var62.y.length >= ~var42) {
								++var60;
							} else {
								do {
									var24 = var2.readUnsignedByte(255) + 1 + var24;
									var62.y[var42] = (byte) var24;
									var42 += 2;
								} while (~var62.y.length < ~var42);
								
								++var60;
							}
						}
					} while (var15 > var60);
				}
				
				var41 = 0;
				if (var53 == 0 && var41 >= var15) {
					if (var57 != null) {
						var24 = var2.readUnsignedByte(255);
						var57[0] = (byte) var24;
						var42 = 2;
						if (var53 != 0 || var57.length > var42) {
							do {
								var24 = 1 + (var24 - -var2.readUnsignedByte(255));
								var57[var42] = (byte) var24;
								var42 += 2;
							} while (var57.length > var42);
						}
						
						var63 = var57[0];
						var44 = var57[1];
						var45 = 0;
						if (var53 != 0 || var63 > var45) {
							do {
								this.I[var45] = (byte) (32 + this.I[var45] * var44 >> 6);
								++var45;
							} while (var63 > var45);
						}
						
						var46 = 2;
						if (var53 != 0 || var46 < var57.length) {
							do {
								var48 = var57[1 + var46];
								var47 = var57[var46];
								var49 = var44 * (var47 + -var63) + (-var63 + var47) / 2;
								var50 = var63;
								if (var53 != 0 || ~var63 > ~var47) {
									do {
										var51 = jd.a(-var63 + var47, -30453, var49);
										var49 += -var44 + var48;
										this.I[var50] = (byte) (var51 * this.I[var50] + 32 >> 6);
										++var50;
									} while (~var50 > ~var47);
								}
								
								var46 += 2;
								var63 = var47;
								var44 = var48;
							} while (var46 < var57.length);
						}
						
						var59 = null;
						var66 = var63;
						if (var53 != 0 || ~var63 > -129) {
							do {
								this.I[var66] = (byte) (this.I[var66] * var44 + 32 >> 6);
								++var66;
							} while (~var66 > -129);
						}
					}
					
					if (var20 != null) {
						var24 = var2.readUnsignedByte(255);
						var20[0] = (byte) var24;
						var42 = 2;
						if (var53 != 0 || var20.length > var42) {
							do {
								var24 += var2.readUnsignedByte(255) + 1;
								var20[var42] = (byte) var24;
								var42 += 2;
							} while (var20.length > var42);
						}
						
						var63 = var20[0];
						var64 = var20[1] << 1;
						var45 = 0;
						if (var53 != 0 || var63 > var45) {
							do {
								var46 = (this.J[var45] & 255) - -var64;
								if (var46 < 0) {
									var46 = 0;
								}
								
								if (var46 > 128) {
									var46 = 128;
								}
								
								this.J[var45] = (byte) var46;
								++var45;
							} while (var63 > var45);
						}
						
						var46 = 2;
						if (var53 != 0 || var20.length > var46) {
							do {
								var67 = var20[var46 + 1] << 1;
								var47 = var20[var46];
								var49 = (var47 - var63) / 2 + (-var63 + var47) * var64;
								var50 = var63;
								if (var53 != 0 || var63 < var47) {
									do {
										var51 = jd.a(-var63 + var47, -30453, var49);
										var52 = var51 + (this.J[var50] & 255);
										var49 += var67 + -var64;
										if (var52 < 0) {
											var52 = 0;
										}
										
										if (var52 > 128) {
											var52 = 128;
										}
										
										this.J[var50] = (byte) var52;
										++var50;
									} while (var50 < var47);
								}
								
								var64 = var67;
								var63 = var47;
								var46 += 2;
							} while (var20.length > var46);
						}
						
						var58 = null;
						var66 = var63;
						if (var53 != 0 || var63 < 128) {
							do {
								var67 = var64 + (255 & this.J[var66]);
								if (var67 < 0) {
									var67 = 0;
								}
								
								if (var67 > 128) {
									var67 = 128;
								}
								
								this.J[var66] = (byte) var67;
								++var66;
							} while (var66 < 128);
						}
					}
					
					var42 = 0;
					if (var53 != 0) {
						var55[var42].c = var2.readUnsignedByte(255);
						++var42;
					}
					
					while (var42 < var15) {
						var55[var42].c = var2.readUnsignedByte(255);
						++var42;
					}
					
					var43 = 0;
					if (var53 != 0 || ~var43 > ~var15) {
						do {
							var65 = var55[var43];
							if (var65.x != null) {
								var65.z = var2.readUnsignedByte(255);
							}
							
							if (var65.y != null) {
								var65.e = var2.readUnsignedByte(255);
							}
							
							if (var65.c > 0) {
								var65.h = var2.readUnsignedByte(255);
							}
							
							++var43;
						} while (~var43 > ~var15);
					}
					
					var64 = 0;
					if (var53 != 0) {
						var55[var64].o = var2.readUnsignedByte(255);
						++var64;
					}
					
					while (~var64 > ~var15) {
						var55[var64].o = var2.readUnsignedByte(255);
						++var64;
					}
					
					var45 = 0;
					if (var53 != 0 || ~var15 < ~var45) {
						do {
							var68 = var55[var45];
							if (var68.o > 0) {
								var68.j = var2.readUnsignedByte(255);
							}
							
							++var45;
						} while (~var15 < ~var45);
					}
					
					var46 = 0;
					if (var53 != 0 || ~var46 > ~var15) {
						do {
							var69 = var55[var46];
							if (var69.j > 0) {
								var69.k = var2.readUnsignedByte(255);
							}
							
							++var46;
						} while (~var46 > ~var15);
						
					}
				} else {
					do {
						var61 = var55[var41];
						if (var61.x == null) {
							++var41;
						} else {
							var24 = 0;
							var43 = 2;
							if (var53 != 0) {
								var24 = var2.readUnsignedByte(255) + 1 + var24;
								var61.x[var43] = (byte) var24;
								var43 += 2;
							}
							
							while (~var61.x.length < ~var43) {
								var24 = var2.readUnsignedByte(255) + 1 + var24;
								var61.x[var43] = (byte) var24;
								var43 += 2;
							}
							
							++var41;
						}
					} while (var41 < var15);
					
					if (var57 != null) {
						var24 = var2.readUnsignedByte(255);
						var57[0] = (byte) var24;
						var42 = 2;
						if (var53 != 0 || var57.length > var42) {
							do {
								var24 = 1 + (var24 - -var2.readUnsignedByte(255));
								var57[var42] = (byte) var24;
								var42 += 2;
							} while (var57.length > var42);
						}
						
						var63 = var57[0];
						var44 = var57[1];
						var45 = 0;
						if (var53 != 0 || var63 > var45) {
							do {
								this.I[var45] = (byte) (32 + this.I[var45] * var44 >> 6);
								++var45;
							} while (var63 > var45);
						}
						
						var46 = 2;
						if (var53 != 0 || var46 < var57.length) {
							do {
								var48 = var57[1 + var46];
								var47 = var57[var46];
								var49 = var44 * (var47 + -var63) + (-var63 + var47) / 2;
								var50 = var63;
								if (var53 != 0 || ~var63 > ~var47) {
									do {
										var51 = jd.a(-var63 + var47, -30453, var49);
										var49 += -var44 + var48;
										this.I[var50] = (byte) (var51 * this.I[var50] + 32 >> 6);
										++var50;
									} while (~var50 > ~var47);
								}
								
								var46 += 2;
								var63 = var47;
								var44 = var48;
							} while (var46 < var57.length);
						}
						
						var59 = null;
						var66 = var63;
						if (var53 != 0 || ~var63 > -129) {
							do {
								this.I[var66] = (byte) (this.I[var66] * var44 + 32 >> 6);
								++var66;
							} while (~var66 > -129);
						}
					}
					
					if (var20 != null) {
						var24 = var2.readUnsignedByte(255);
						var20[0] = (byte) var24;
						var42 = 2;
						if (var53 != 0 || var20.length > var42) {
							do {
								var24 += var2.readUnsignedByte(255) + 1;
								var20[var42] = (byte) var24;
								var42 += 2;
							} while (var20.length > var42);
						}
						
						var63 = var20[0];
						var64 = var20[1] << 1;
						var45 = 0;
						if (var53 != 0 || var63 > var45) {
							do {
								var46 = (this.J[var45] & 255) - -var64;
								if (var46 < 0) {
									var46 = 0;
								}
								
								if (var46 > 128) {
									var46 = 128;
								}
								
								this.J[var45] = (byte) var46;
								++var45;
							} while (var63 > var45);
						}
						
						var46 = 2;
						if (var53 != 0 || var20.length > var46) {
							do {
								var67 = var20[var46 + 1] << 1;
								var47 = var20[var46];
								var49 = (var47 - var63) / 2 + (-var63 + var47) * var64;
								var50 = var63;
								if (var53 != 0 || var63 < var47) {
									do {
										var51 = jd.a(-var63 + var47, -30453, var49);
										var52 = var51 + (this.J[var50] & 255);
										var49 += var67 + -var64;
										if (var52 < 0) {
											var52 = 0;
										}
										
										if (var52 > 128) {
											var52 = 128;
										}
										
										this.J[var50] = (byte) var52;
										++var50;
									} while (var50 < var47);
								}
								
								var64 = var67;
								var63 = var47;
								var46 += 2;
							} while (var20.length > var46);
						}
						
						var58 = null;
						var66 = var63;
						if (var53 != 0 || var63 < 128) {
							do {
								var67 = var64 + (255 & this.J[var66]);
								if (var67 < 0) {
									var67 = 0;
								}
								
								if (var67 > 128) {
									var67 = 128;
								}
								
								this.J[var66] = (byte) var67;
								++var66;
							} while (var66 < 128);
						}
					}
					
					var42 = 0;
					if (var53 != 0) {
						var55[var42].c = var2.readUnsignedByte(255);
						++var42;
					}
					
					while (var42 < var15) {
						var55[var42].c = var2.readUnsignedByte(255);
						++var42;
					}
					
					var43 = 0;
					if (var53 != 0 || ~var43 > ~var15) {
						do {
							var65 = var55[var43];
							if (var65.x != null) {
								var65.z = var2.readUnsignedByte(255);
							}
							
							if (var65.y != null) {
								var65.e = var2.readUnsignedByte(255);
							}
							
							if (var65.c > 0) {
								var65.h = var2.readUnsignedByte(255);
							}
							
							++var43;
						} while (~var43 > ~var15);
					}
					
					var64 = 0;
					if (var53 != 0) {
						var55[var64].o = var2.readUnsignedByte(255);
						++var64;
					}
					
					while (~var64 > ~var15) {
						var55[var64].o = var2.readUnsignedByte(255);
						++var64;
					}
					
					var45 = 0;
					if (var53 != 0 || ~var15 < ~var45) {
						do {
							var68 = var55[var45];
							if (var68.o > 0) {
								var68.j = var2.readUnsignedByte(255);
							}
							
							++var45;
						} while (~var15 < ~var45);
					}
					
					var46 = 0;
					if (var53 != 0 || ~var46 > ~var15) {
						do {
							var69 = var55[var46];
							if (var69.j > 0) {
								var69.k = var2.readUnsignedByte(255);
							}
							
							++var46;
						} while (~var46 > ~var15);
						
					}
				}
			}
		} catch (RuntimeException var54) {
			throw bc.a(var54, "id.<init>(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}
	
	static {
		loadingTitleScreen2 = loadingTitleScreen;
		z = new int[] {0, 0, 2, 0, 0, 2, 1, 1, 0};
		p = false;
		v = rf.a(40, "Account locked as we suspect it has been stolen)3");
		r = rf.a(40, "und haben es deaktiviert)3 Klicken Sie auf der");
		B = rf.a(40, "Invalid loginserver requested)3");
		E = v;
		x = B;
	}
}
