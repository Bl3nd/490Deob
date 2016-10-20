final class eg {
	
	private int a;
	private ne[] b = new ne[10];
	private int c;
	
	final oa a() {
		byte[] var1 = this.b();
		return new oa(22050, var1, 22050 * this.a / 1000, 22050 * this.c / 1000);
	}
	
	private byte[] b() {
		int var1 = 0;
		
		for (int var2 = 0; var2 < 10; ++var2) {
			if (this.b[var2] != null && this.b[var2].r + this.b[var2].g > var1) {
				var1 = this.b[var2].r + this.b[var2].g;
			}
		}
		
		if (var1 == 0) {
			return new byte[0];
		} else {
			int var3 = 22050 * var1 / 1000;
			byte[] var4 = new byte[var3];
			
			for (int var5 = 0; var5 < 10; ++var5) {
				if (this.b[var5] != null) {
					int var6 = this.b[var5].r * 22050 / 1000;
					int var7 = this.b[var5].g * 22050 / 1000;
					int[] var8 = this.b[var5].a(var6, this.b[var5].r);
					
					for (int var9 = 0; var9 < var6; ++var9) {
						int var10 = var4[var9 + var7] + (var8[var9] >> 8);
						if ((var10 + 128 & -256) != 0) {
							var10 = var10 >> 31 ^ 127;
						}
						
						var4[var9 + var7] = (byte) var10;
					}
				}
			}
			
			return var4;
		}
	}
	
	static eg a(pe var0, int var1, int var2) {
		byte[] var3 = var0.a((byte) 74, var2, var1);
		return var3 == null ? null : new eg(new og(var3));
	}
	
	final int c() {
		int var1 = 9999999;
		
		for (int var2 = 0; var2 < 10; ++var2) {
			if (this.b[var2] != null && this.b[var2].g / 20 < var1) {
				var1 = this.b[var2].g / 20;
			}
		}
		
		if (this.a < this.c && this.a / 20 < var1) {
			var1 = this.a / 20;
		}
		
		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; ++var3) {
				if (this.b[var3] != null) {
					this.b[var3].g -= var1 * 20;
				}
			}
			
			if (this.a < this.c) {
				this.a -= var1 * 20;
				this.c -= var1 * 20;
			}
			
			return var1;
		} else {
			return 0;
		}
	}
	
	private eg(og var1) {
		for (int var2 = 0; var2 < 10; ++var2) {
			int var3 = var1.readUnsignedByte(255);
			if (var3 != 0) {
				--var1.pointer;
				this.b[var2] = new ne();
				this.b[var2].a(var1);
			}
		}
		
		this.a = var1.readShort(83);
		this.c = var1.readShort(126);
	}
	
	private eg() {
	}
}
