#need to install pytesseract


import sys
import pytesseract
# import pillow
from PIL import Image
def printResult(arg):

	imageFilePath = arg
	image = Image.open(imageFilePath)
	code = pytesseract.image_to_string(image,lang="eng")
	print(code)

printResult(sys.argv[1])