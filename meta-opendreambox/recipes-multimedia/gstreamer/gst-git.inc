PE = "1"

S = "${WORKDIR}/git"

do_configure_prepend() {
	# This m4 file contains nastiness which conflicts with libtool 2.2.2
	rm ${S}/m4/lib-link.m4 || true
}

do_common_update() {
	cd ${S}
	# Make sure we have common
	if test ! -f common/gst-autogen.sh;
	then
	  echo "+ Setting up common submodule"
	  git submodule init
	fi
	git submodule update

	# source helper functions
	if test ! -f common/gst-autogen.sh;
	then
	  echo There is something wrong with your source tree.
	  echo You are missing common/gst-autogen.sh
	  exit 1
	fi
	. common/gst-autogen.sh
	# install pre-commit hook for doing clean commits
	if test ! \( -x .git/hooks/pre-commit -a -L .git/hooks/pre-commit \);
	then
	    rm -f .git/hooks/pre-commit
	    ln -s ../../common/hooks/pre-commit.hook .git/hooks/pre-commit
	fi

	# GNU gettext automake support doesn't get along with git.
	# https://bugzilla.gnome.org/show_bug.cgi?id=661128
	autopoint || touch config.rpath
	touch -t 200001010000 po/gst-plugins-base-0.10.pot
}

addtask common_update after do_unpack before do_patch
