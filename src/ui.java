final class ui extends vd {
	
	byte[] o;
	md p;
	
	static ui a(pe var0, int var1, int var2) {
		byte[] var3 = var0.a((byte) -81, var2, var1);
		return var3 == null ? null : new ui(new og(var3));
	}
	
	final void a() {
		if (this.p == null) {
			this.p = new md(16);
			int[] var1 = new int[16];
			int[] var2 = new int[16];
			var1[9] = var2[9] = 128;
			mb var3 = new mb(this.o);
			int var4 = var3.e();
			
			for (int var5 = 0; var5 < var4; ++var5) {
				var3.a(var5);
				var3.f(var5);
				var3.d(var5);
			}
			
			label53:
			do {
				while (true) {
					int var6 = var3.d();
					int var7 = var3.f[var6];
					
					while (var3.f[var6] == var7) {
						var3.a(var6);
						int var8 = var3.b(var6);
						if (var8 == 1) {
							var3.f();
							var3.d(var6);
							continue label53;
						}
						
						int var9 = var8 & 240;
						int var10;
						int var11;
						int var12;
						if (var9 == 176) {
							var10 = var8 & 15;
							var11 = var8 >> 8 & 127;
							var12 = var8 >> 16 & 127;
							if (var11 == 0) {
								var1[var10] = (var1[var10] & -2080769) + (var12 << 14);
							}
							
							if (var11 == 32) {
								var1[var10] = (var1[var10] & -16257) + (var12 << 7);
							}
						}
						
						if (var9 == 192) {
							var10 = var8 & 15;
							var11 = var8 >> 8 & 127;
							var2[var10] = var1[var10] + var11;
						}
						
						if (var9 == 144) {
							var10 = var8 & 15;
							var11 = var8 >> 8 & 127;
							var12 = var8 >> 16 & 127;
							if (var12 > 0) {
								int var13 = var2[var10];
								ci var14 = (ci) this.p.a((long) var13, 22346);
								if (var14 == null) {
									var14 = new ci(new byte[128]);
									this.p.a(var14, (long) var13, true);
								}
								
								var14.o[var11] = 1;
							}
						}
						
						var3.f(var6);
						var3.d(var6);
					}
				}
			} while (!var3.c());
			
		}
	}
	
	final void b() {
		this.p = null;
	}
	
	private ui(og var1) {
		var1.pointer = var1.buffer.length - 3;
		int var2 = var1.readUnsignedByte(255);
		int var3 = var1.readShort(95);
		int var4 = 14 + var2 * 10;
		var1.pointer = 0;
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		int var12 = 0;
		
		int var14;
		int var15;
		for (int var13 = 0; var13 < var2; ++var13) {
			var14 = -1;
			
			while (true) {
				var15 = var1.readUnsignedByte(255);
				if (var15 != var14) {
					++var4;
				}
				
				var14 = var15 & 15;
				if (var15 == 7) {
					break;
				}
				
				if (var15 == 23) {
					++var5;
				} else if (var14 == 0) {
					++var7;
				} else if (var14 == 1) {
					++var8;
				} else if (var14 == 2) {
					++var6;
				} else if (var14 == 3) {
					++var9;
				} else if (var14 == 4) {
					++var10;
				} else if (var14 == 5) {
					++var11;
				} else {
					if (var14 != 6) {
						throw new RuntimeException();
					}
					
					++var12;
				}
			}
		}
		
		var4 += 5 * var5;
		var4 += 2 * (var7 + var8 + var6 + var9 + var11);
		var4 += var10 + var12;
		var14 = var1.pointer;
		var15 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
		
		for (int var16 = 0; var16 < var15; ++var16) {
			var1.a(false);
		}
		
		var4 += var1.pointer - var14;
		int var17 = var1.pointer;
		int var18 = 0;
		int var19 = 0;
		int var20 = 0;
		int var21 = 0;
		int var22 = 0;
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		int var28 = 0;
		int var29 = 0;
		int var30 = 0;
		
		for (int var31 = 0; var31 < var6; ++var31) {
			var30 = var30 + var1.readUnsignedByte(255) & 127;
			if (var30 != 0 && var30 != 32) {
				if (var30 == 1) {
					++var18;
				} else if (var30 == 33) {
					++var19;
				} else if (var30 == 7) {
					++var20;
				} else if (var30 == 39) {
					++var21;
				} else if (var30 == 10) {
					++var22;
				} else if (var30 == 42) {
					++var23;
				} else if (var30 == 99) {
					++var24;
				} else if (var30 == 98) {
					++var25;
				} else if (var30 == 101) {
					++var26;
				} else if (var30 == 100) {
					++var27;
				} else if (var30 != 64 && var30 != 65 && var30 != 120 && var30 != 121 && var30 != 123) {
					++var29;
				} else {
					++var28;
				}
			} else {
				++var12;
			}
		}
		
		int var32 = 0;
		int var33 = var1.pointer;
		var1.pointer += var28;
		int var34 = var1.pointer;
		var1.pointer += var11;
		int var35 = var1.pointer;
		var1.pointer += var10;
		int var36 = var1.pointer;
		var1.pointer += var9;
		int var37 = var1.pointer;
		var1.pointer += var18;
		int var38 = var1.pointer;
		var1.pointer += var20;
		int var39 = var1.pointer;
		var1.pointer += var22;
		int var40 = var1.pointer;
		var1.pointer += var7 + var8 + var11;
		int var41 = var1.pointer;
		var1.pointer += var7;
		int var42 = var1.pointer;
		var1.pointer += var29;
		int var43 = var1.pointer;
		var1.pointer += var8;
		int var44 = var1.pointer;
		var1.pointer += var19;
		int var45 = var1.pointer;
		var1.pointer += var21;
		int var46 = var1.pointer;
		var1.pointer += var23;
		int var47 = var1.pointer;
		var1.pointer += var12;
		int var48 = var1.pointer;
		var1.pointer += var9;
		int var49 = var1.pointer;
		var1.pointer += var24;
		int var50 = var1.pointer;
		var1.pointer += var25;
		int var51 = var1.pointer;
		var1.pointer += var26;
		int var52 = var1.pointer;
		var1.pointer += var27;
		int var53 = var1.pointer;
		var1.pointer += var5 * 3;
		this.o = new byte[var4];
		og var54 = new og(this.o);
		var54.writeInt(1297377380, (byte) 95);
		var54.writeInt(6, (byte) 5);
		var54.d(26894, var2 > 1 ? 1 : 0);
		var54.d(26894, var2);
		var54.d(26894, var3);
		var1.pointer = var14;
		int var55 = 0;
		int var56 = 0;
		int var57 = 0;
		int var58 = 0;
		int var59 = 0;
		int var60 = 0;
		int var61 = 0;
		int[] var62 = new int[128];
		var30 = 0;
		
		label220:
		for (int var63 = 0; var63 < var2; ++var63) {
			var54.writeInt(1297379947, (byte) 78);
			var54.pointer += 4;
			int var64 = var54.pointer;
			int var65 = -1;
			
			while (true) {
				while (true) {
					int var66 = var1.a(false);
					var54.b((byte) -124, var66);
					int var67 = var1.buffer[var32++] & 255;
					boolean var68 = var67 != var65;
					var65 = var67 & 15;
					if (var67 == 7) {
						if (var68) {
							var54.writeByte(91, 255);
						}
						
						var54.writeByte(106, 47);
						var54.writeByte(94, 0);
						var54.c(99, var54.pointer - var64);
						continue label220;
					}
					
					if (var67 == 23) {
						if (var68) {
							var54.writeByte(99, 255);
						}
						
						var54.writeByte(81, 81);
						var54.writeByte(84, 3);
						var54.writeByte(88, var1.buffer[var53++]);
						var54.writeByte(69, var1.buffer[var53++]);
						var54.writeByte(91, var1.buffer[var53++]);
					} else {
						var55 ^= var67 >> 4;
						if (var65 == 0) {
							if (var68) {
								var54.writeByte(103, 144 + var55);
							}
							
							var56 += var1.buffer[var40++];
							var57 += var1.buffer[var41++];
							var54.writeByte(94, var56 & 127);
							var54.writeByte(70, var57 & 127);
						} else if (var65 == 1) {
							if (var68) {
								var54.writeByte(82, 128 + var55);
							}
							
							var56 += var1.buffer[var40++];
							var58 += var1.buffer[var43++];
							var54.writeByte(110, var56 & 127);
							var54.writeByte(113, var58 & 127);
						} else if (var65 == 2) {
							if (var68) {
								var54.writeByte(113, 176 + var55);
							}
							
							var30 = var30 + var1.buffer[var17++] & 127;
							var54.writeByte(124, var30);
							byte var69;
							if (var30 != 0 && var30 != 32) {
								if (var30 == 1) {
									var69 = var1.buffer[var37++];
								} else if (var30 == 33) {
									var69 = var1.buffer[var44++];
								} else if (var30 == 7) {
									var69 = var1.buffer[var38++];
								} else if (var30 == 39) {
									var69 = var1.buffer[var45++];
								} else if (var30 == 10) {
									var69 = var1.buffer[var39++];
								} else if (var30 == 42) {
									var69 = var1.buffer[var46++];
								} else if (var30 == 99) {
									var69 = var1.buffer[var49++];
								} else if (var30 == 98) {
									var69 = var1.buffer[var50++];
								} else if (var30 == 101) {
									var69 = var1.buffer[var51++];
								} else if (var30 == 100) {
									var69 = var1.buffer[var52++];
								} else if (var30 != 64 && var30 != 65 && var30 != 120 && var30 != 121 && var30 != 123) {
									var69 = var1.buffer[var42++];
								} else {
									var69 = var1.buffer[var33++];
								}
							} else {
								var69 = var1.buffer[var47++];
							}
							
							int var70 = var69 + var62[var30];
							var62[var30] = var70;
							var54.writeByte(118, var70 & 127);
						} else if (var65 == 3) {
							if (var68) {
								var54.writeByte(86, 224 + var55);
							}
							
							var59 += var1.buffer[var48++];
							var59 += var1.buffer[var36++] << 7;
							var54.writeByte(117, var59 & 127);
							var54.writeByte(70, var59 >> 7 & 127);
						} else if (var65 == 4) {
							if (var68) {
								var54.writeByte(69, 208 + var55);
							}
							
							var60 += var1.buffer[var35++];
							var54.writeByte(125, var60 & 127);
						} else if (var65 == 5) {
							if (var68) {
								var54.writeByte(75, 160 + var55);
							}
							
							var56 += var1.buffer[var40++];
							var61 += var1.buffer[var34++];
							var54.writeByte(118, var56 & 127);
							var54.writeByte(91, var61 & 127);
						} else {
							if (var65 != 6) {
								throw new RuntimeException();
							}
							
							if (var68) {
								var54.writeByte(124, 192 + var55);
							}
							
							var54.writeByte(83, var1.buffer[var47++]);
						}
					}
				}
			}
		}
		
	}
}
