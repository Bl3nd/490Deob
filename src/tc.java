final class tc extends rg {
	
	static int D;
	int F = -1;
	int G = 0;
	int H = -1;
	boolean J = true;
	static int K;
	static int L;
	static int M;
	static int N;
	static int O;
	
	static void b(byte var0) {
		try {
			if (var0 != 89) {
				b((byte) 15);
			}
			
			++N;
			sh.f.b((int) 9946);
		} catch (RuntimeException var2) {
			throw bc.a(var2, "tc.E(" + var0 + ')');
		}
	}
	
	static void b(int var0, byte var1) {
		try {
			label42:
			{
				if (var0 != -1 || li.aBoolean_q) {
					if (var0 == -1 || var0 == sc.g && jc.k(var1 + 15620) || ~bc.mb == -1 || li.aBoolean_q) {
						break label42;
					}
					
					tg.a(var0, q.cacheFile_6, false, bc.mb, 0, var1 + -114, 2);
					if (client.anInt_wb == 0) {
						break label42;
					}
				}
				
				sh.b(-38);
			}
			
			++M;
			sc.g = var0;
			if (var1 == 114) {
				;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "tc.C(" + var0 + ',' + var1 + ')');
		}
	}
	
	static ra b(int id, int unused) {
		++D;
		int offsetId = id >> 16;
		if (wg.cb[offsetId] == null || wg.cb[offsetId][id] == null) {
			boolean flag = gf.a(true, offsetId);
			if (!flag) {
				return null;
			}
		}

		return wg.cb[offsetId][id];
	}
	
	final void a(byte var1, int var2, og var3) {
		int var5 = client.anInt_wb;
		
		try {
			++L;
			
			do {
				int var4 = var3.readUnsignedByte(var1 ^ -229);
				if (var4 == 0) {
					break;
				}
				
				this.a(var3, var2, var4, (byte) 63);
			} while (var5 == 0);
			
			if (var1 != -28) {
				b(-93, (int) -60);
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "tc.F(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	private int c(int var1, int var2) {
		int var22 = client.anInt_wb;
		
		try {
			++O;
			if (var2 == 16711935) {
				return -1;
			} else {
				double var3 = (double) (255 & var2 >> 16) / 256.0D;
				double var5 = (double) (('￩' & var2) >> 8) / 256.0D;
				double var7 = (double) (255 & var2) / 256.0D;
				double var9 = var3;
				if (var1 > -114) {
					return 51;
				} else {
					if (var5 < var3) {
						var9 = var5;
					}
					
					if (var7 < var9) {
						var9 = var7;
					}
					
					double var15 = 0.0D;
					double var11 = var3;
					double var13 = 0.0D;
					if (var3 < var5) {
						var11 = var5;
					}
					
					if (var11 < var7) {
						var11 = var7;
					}
					
					double var17 = (var11 + var9) / 2.0D;
					if (var9 != var11) {
						label88:
						{
							if (var3 != var11) {
								if (var11 == var5) {
									var13 = (-var3 + var7) / (var11 - var9) + 2.0D;
									if (var22 == 0) {
										break label88;
									}
								}
								
								if (var7 != var11) {
									break label88;
								}
								
								var13 = 4.0D + (var3 - var5) / (-var9 + var11);
								if (var22 == 0) {
									break label88;
								}
							}
							
							var13 = (var5 - var7) / (-var9 + var11);
						}
						
						if (var17 < 0.5D) {
							var15 = (var11 - var9) / (var9 + var11);
						}
						
						if (var17 >= 0.5D) {
							var15 = (var11 - var9) / (-var9 + -var11 + 2.0D);
						}
					}
					
					int var21;
					label78:
					{
						var13 /= 6.0D;
						var21 = (int) (256.0D * var17);
						if (var21 < 0) {
							var21 = 0;
							if (var22 == 0) {
								break label78;
							}
						}
						
						if (~var21 < -256) {
							var21 = 255;
						}
					}
					
					int var20;
					label73:
					{
						var20 = (int) (var15 * 256.0D);
						if (~var20 > -1) {
							var20 = 0;
							if (var22 == 0) {
								break label73;
							}
						}
						
						if (var20 > 255) {
							var20 = 255;
						}
					}
					
					label106:
					{
						if (~var21 < -244) {
							var20 >>= 4;
							if (var22 == 0) {
								break label106;
							}
						}
						
						if (~var21 >= -218) {
							if (~var21 < -193) {
								var20 >>= 2;
								if (var22 == 0) {
									break label106;
								}
							}
							
							if (var21 <= 179) {
								break label106;
							}
							
							var20 >>= 1;
							if (var22 == 0) {
								break label106;
							}
						}
						
						var20 >>= 3;
					}
					
					int var19 = (int) (var13 * 256.0D);
					return (var19 >> 2 << 10) - -(var20 >> 5 << 7) - -(var21 >> 1);
				}
			}
		} catch (RuntimeException var23) {
			throw bc.a(var23, "tc.B(" + var1 + ',' + var2 + ')');
		}
	}
	
	private void a(og var1, int var2, int var3, byte var4) {
		try {
			++K;
			if (var4 == 63) {
				if (var3 == 1) {
					this.G = this.c(-126, var1.readUnsignedMedInt(-120));
				} else if (~var3 == -3) {
					this.H = var1.readUnsignedByte(255);
				} else {
					if (var3 == 3) {
						this.H = var1.readShort(109);
						if (this.H == '\uffff') {
							this.H = -1;
						}
					} else {
						if (~var3 != -6) {
							if (var3 != 7) {
								if (var3 != 8 && ~var3 == -10) {
									var1.readShort(var4 + -29);
									return;
								}
							} else {
								this.F = this.c(-116, var1.readUnsignedMedInt(-121));
							}
							
							return;
						}
						
						this.J = false;
					}
					
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "tc.D(" + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ',' + var4 + ')');
		}
	}
}
