all: opendreambox.pdf

%.pdf: %.tex Makefile
	@echo '[*] Generating $@'
	@pdflatex $< >/dev/null
	@pdflatex $< >/dev/null
	@pdflatex $< >/dev/null

%.dvi: %.tex Makefile
	@echo '[*] Generating $@'
	@latex $< >/dev/null
	@latex $< >/dev/null
	@latex $< >/dev/null

HTLATEX_OPTIONS = "html"

%.html: %.tex Makefile
	@echo '[*] Generating $@'
	@htlatex $< "${HTLATEX_OPTIONS}" >/dev/null
	@htlatex $< "${HTLATEX_OPTIONS}" >/dev/null
	@htlatex $< "${HTLATEX_OPTIONS}" >/dev/null

%.txt: %.html
	@echo '[*] Generating $@'
	@links -dump -width 85 $< | sed -e 's/\s\+$$//' > $@

clean:
	@echo '[*] Deleting generated documentation files'
	@$(RM) *.{4ct,4tc,aux,dvi,idv,lg,log,out,pdf,tmp,toc,xml,xref}
